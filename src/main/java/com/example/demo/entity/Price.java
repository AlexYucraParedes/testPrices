package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import org.springframework.format.annotation.DateTimeFormat;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table; 

@Entity
@Table(name="prices")
public class Price implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	//@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date")
	@DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
	private LocalDateTime  startDate;
	
	//@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern="yyy-MM-dd-HH.mm.ss")
	@Column(name = "end_date")
	private LocalDateTime  endDate;
	
	@Column(name = "priceList")
	private Long priceList;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private Product product;
	 
	
	@Column(name = "priority")
	private Integer priority;
	
	@Column(name = "price")
	private BigDecimal price;
		
	@Column(name = "curr")
	private String curr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	} 

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Long getPriceList() {
		return priceList;
	}

	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}
	
 
	//=== GETTERS AND SETTERS ==//
 
	
	
}
