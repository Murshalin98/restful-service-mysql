package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class License {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer LicenseCountryCode;
    
    private Integer LicenseNumberYears;
    
    private String DriverLicenseTypeCode;
    
    private String DriverLicenseExpiryDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLicenseCountryCode() {
		return LicenseCountryCode;
	}

	public void setLicenseCountryCode(Integer licenseCountryCode) {
		LicenseCountryCode = licenseCountryCode;
	}

	public Integer getLicenseNumberYears() {
		return LicenseNumberYears;
	}

	public void setLicenseNumberYears(Integer licenseNumberYears) {
		LicenseNumberYears = licenseNumberYears;
	}

	public String getDriverLicenseTypeCode() {
		return DriverLicenseTypeCode;
	}

	public void setDriverLicenseTypeCode(String driverLicenseTypeCode) {
		DriverLicenseTypeCode = driverLicenseTypeCode;
	}

	public String getDriverLicenseExpiryDate() {
		return DriverLicenseExpiryDate;
	}

	public void setDriverLicenseExpiryDate(String driverLicenseExpiryDate) {
		DriverLicenseExpiryDate = driverLicenseExpiryDate;
	}
}