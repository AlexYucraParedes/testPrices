package com.example.demo.service;

import java.time.LocalDateTime; 
import java.util.List;

import com.example.demo.entity.Price;
import com.example.demo.model.PriceDTO; 

public interface IPriceService {

	public List<Price> findAll();
	public PriceDTO customSearch(LocalDateTime date,Long product, Long brand); 
}
