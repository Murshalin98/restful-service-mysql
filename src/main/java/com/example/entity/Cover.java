package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cover {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private Integer CoverCode;
	
	private String CoverId;
	
	private String CoverNameAr;
	
	private Integer CoverNameEn;
	
	private Integer CoverPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCoverCode() {
		return CoverCode;
	}

	public void setCoverCode(Integer coverCode) {
		CoverCode = coverCode;
	}

	public String getCoverId() {
		return CoverId;
	}

	public void setCoverId(String coverId) {
		CoverId = coverId;
	}

	public String getCoverNameAr() {
		return CoverNameAr;
	}

	public void setCoverNameAr(String coverNameAr) {
		CoverNameAr = coverNameAr;
	}

	public Integer getCoverNameEn() {
		return CoverNameEn;
	}

	public void setCoverNameEn(Integer coverNameEn) {
		CoverNameEn = coverNameEn;
	}

	public Integer getCoverPrice() {
		return CoverPrice;
	}

	public void setCoverPrice(Integer coverPrice) {
		CoverPrice = coverPrice;
	}
}