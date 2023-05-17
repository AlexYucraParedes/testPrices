package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Price;
import com.example.demo.model.PriceDTO;
import com.example.demo.service.IPriceService;
 

@RestController
@RequestMapping("/api/prices")
public class PriceController {
	 
	@Autowired
	public IPriceService pricesService;
	
	@GetMapping("/")
	public List<Price> search() {
		return pricesService.findAll();
	}
	
	@GetMapping("/customSearch/")
	public ResponseEntity<?> customSearch(@RequestParam LocalDateTime date,@RequestParam Long product,@RequestParam Long brand) {
		PriceDTO result = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			result = pricesService.customSearch(date,product,brand);
		}catch(DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
		if(result == null) {
			response.put("mensaje", "No se encontraron resultados");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		} 
		return new ResponseEntity<PriceDTO>(result, HttpStatus.OK);
	}
	 
}
