package com.example.demo.repository;

import java.time.LocalDateTime; 
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Price;

public interface IPriceRepository extends CrudRepository<Price, Long> {

	@Query("select p from Price p where ?1 between p.startDate and p.endDate and p.product.id=?2 and p.brand.id=?3 order by p.priority desc")
	public List<Price> customSearch(LocalDateTime date, Long product, Long brand);
	
}
