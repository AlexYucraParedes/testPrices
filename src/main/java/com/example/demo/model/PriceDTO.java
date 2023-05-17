package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PriceDTO {

    private Long productId; 
    private Long brandId; 
    private Long priceList;
    private LocalDateTime appDate;
    private BigDecimal finalPrice;
    
    
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public Long getPriceList() {
		return priceList;
	}
	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}
	public LocalDateTime getAppDate() {
		return appDate;
	}
	public void setAppDate(LocalDateTime appDate) {
		this.appDate = appDate;
	}
	public BigDecimal getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}
    
    

}
