package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String ProductId;
	
	private Integer ExcessValue;
	
	private Long ProductPrice;
	
	private Integer VehicleLimitValue;
	
	private Integer PriceDetails;
	
	private Integer Covers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public Integer getExcessValue() {
		return ExcessValue;
	}

	public void setExcessValue(Integer excessValue) {
		ExcessValue = excessValue;
	}

	public Long getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(Long productPrice) {
		ProductPrice = productPrice;
	}

	public Integer getVehicleLimitValue() {
		return VehicleLimitValue;
	}

	public void setVehicleLimitValue(Integer vehicleLimitValue) {
		VehicleLimitValue = vehicleLimitValue;
	}

	public Integer getPriceDetails() {
		return PriceDetails;
	}

	public void setPriceDetails(Integer priceDetails) {
		PriceDetails = priceDetails;
	}

	public Integer getCovers() {
		return Covers;
	}

	public void setCovers(Integer covers) {
		Covers = covers;
	}
}
