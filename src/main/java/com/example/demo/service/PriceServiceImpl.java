package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.Comparator; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Price;
import com.example.demo.model.PriceDTO;
import com.example.demo.repository.IPriceRepository;

@Service
public class PriceServiceImpl implements IPriceService {

	@Autowired
	private IPriceRepository priceRepository;
	
	@Override
	public List<Price> findAll() { 
		return (List<Price>) priceRepository.findAll(); 
	}
 
	@Override
	public PriceDTO customSearch(LocalDateTime date, Long product, Long brand) { 
		
		List<Price> prices = priceRepository.customSearch(date,product,brand);
		System.out.println(prices.size());
		PriceDTO priceDTO = null;
        if (!prices.isEmpty()) {
            Price price = prices.stream().max(Comparator.comparing(p -> p.getPriority())).get();
            priceDTO = setValuePriceDTO(date, price);
        }
        return priceDTO;

	}

	private PriceDTO setValuePriceDTO(LocalDateTime date, Price price) {
		PriceDTO priceDTO = new PriceDTO();
		priceDTO.setProductId(price.getProduct().getId());
		priceDTO.setBrandId(price.getBrand().getId());
		priceDTO.setPriceList(price.getPriceList());
		priceDTO.setAppDate(date);
		priceDTO.setFinalPrice(price.getPrice());
		
		
		return priceDTO;
	}
}
