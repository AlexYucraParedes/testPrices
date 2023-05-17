package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.IProductService;
 

@RestController
@RequestMapping("/api/product")
public class ProductController {
	 
	@Autowired
	public IProductService productService;
	
	@GetMapping("/")
	public List<Product> index() {
		return productService.findAll();
	}

}
