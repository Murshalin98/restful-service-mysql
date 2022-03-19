package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class PriceDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String PriceTypeCode;
	
	private Integer PriceValue;
	
	private Integer PercentageValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPriceTypeCode() {
		return PriceTypeCode;
	}

	public void setPriceTypeCode(String priceTypeCode) {
		PriceTypeCode = priceTypeCode;
	}

	public Integer getPriceValue() {
		return PriceValue;
	}

	public void setPriceValue(Integer priceValue) {
		PriceValue = priceValue;
	}

	public Integer getPercentageValue() {
		return PercentageValue;
	}

	public void setPercentageValue(Integer percentageValue) {
		PercentageValue = percentageValue;
	}
}
