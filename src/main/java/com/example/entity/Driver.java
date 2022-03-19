package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Driver {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private Integer DriverTypeCode;
	
	private Integer DriverId;
	
	private Integer DriverIdTypeCode;
	
	private String DriverBirthDate;
	
	private String DriverNationalityCode;
	
	private String DriverGenderCode;
	
	private Date DriverBirthDateG;
	
	private String DriverFirstNameAr;
	
	private String DriverMiddleNameAr;
	
	private String DriverLastNameAr;
	
	private String DriverFirstNameEn;
	
	private String DriverMiddleNameEn;
	
	private String DriverLastNameEn;
	
	private String DriverSocialStatusCode;
	
	private String DriverOccupationCode;
	
	private String DriverAddressCity;
	
	private String DriverBusinessCity;
	
	private String DriverDrivingPercentage;
	
	private Integer DriverEducationCode;
	
	private Integer DriverMedicalConditionCode;
	
	private String DriverChildrenBelow16Years;
	
	private String DriverRelationship;
	
	private Integer DriverNOALast5Years;
	
	private Integer DriverNOCLast5Years;
	
	private Integer DriverNCDFreeYears;
	
	private String DriverNCDReference;
	
	private Integer DriverLicenses;
	
	private Integer DriverViolations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDriverTypeCode() {
		return DriverTypeCode;
	}

	public void setDriverTypeCode(Integer driverTypeCode) {
		DriverTypeCode = driverTypeCode;
	}

	public Integer getDriverId() {
		return DriverId;
	}

	public void setDriverId(Integer driverId) {
		DriverId = driverId;
	}

	public Integer getDriverIdTypeCode() {
		return DriverIdTypeCode;
	}

	public void setDriverIdTypeCode(Integer driverIdTypeCode) {
		DriverIdTypeCode = driverIdTypeCode;
	}

	public String getDriverBirthDate() {
		return DriverBirthDate;
	}

	public void setDriverBirthDate(String driverBirthDate) {
		DriverBirthDate = driverBirthDate;
	}

	public String getDriverNationalityCode() {
		return DriverNationalityCode;
	}

	public void setDriverNationalityCode(String driverNationalityCode) {
		DriverNationalityCode = driverNationalityCode;
	}

	public String getDriverGenderCode() {
		return DriverGenderCode;
	}

	public void setDriverGenderCode(String driverGenderCode) {
		DriverGenderCode = driverGenderCode;
	}

	public Date getDriverBirthDateG() {
		return DriverBirthDateG;
	}

	public void setDriverBirthDateG(Date driverBirthDateG) {
		DriverBirthDateG = driverBirthDateG;
	}

	public String getDriverFirstNameAr() {
		return DriverFirstNameAr;
	}

	public void setDriverFirstNameAr(String driverFirstNameAr) {
		DriverFirstNameAr = driverFirstNameAr;
	}

	public String getDriverMiddleNameAr() {
		return DriverMiddleNameAr;
	}

	public void setDriverMiddleNameAr(String driverMiddleNameAr) {
		DriverMiddleNameAr = driverMiddleNameAr;
	}

	public String getDriverLastNameAr() {
		return DriverLastNameAr;
	}

	public void setDriverLastNameAr(String driverLastNameAr) {
		DriverLastNameAr = driverLastNameAr;
	}

	public String getDriverFirstNameEn() {
		return DriverFirstNameEn;
	}

	public void setDriverFirstNameEn(String driverFirstNameEn) {
		DriverFirstNameEn = driverFirstNameEn;
	}

	public String getDriverMiddleNameEn() {
		return DriverMiddleNameEn;
	}

	public void setDriverMiddleNameEn(String driverMiddleNameEn) {
		DriverMiddleNameEn = driverMiddleNameEn;
	}

	public String getDriverLastNameEn() {
		return DriverLastNameEn;
	}

	public void setDriverLastNameEn(String driverLastNameEn) {
		DriverLastNameEn = driverLastNameEn;
	}

	public String getDriverSocialStatusCode() {
		return DriverSocialStatusCode;
	}

	public void setDriverSocialStatusCode(String driverSocialStatusCode) {
		DriverSocialStatusCode = driverSocialStatusCode;
	}

	public String getDriverOccupationCode() {
		return DriverOccupationCode;
	}

	public void setDriverOccupationCode(String driverOccupationCode) {
		DriverOccupationCode = driverOccupationCode;
	}

	public String getDriverAddressCity() {
		return DriverAddressCity;
	}

	public void setDriverAddressCity(String driverAddressCity) {
		DriverAddressCity = driverAddressCity;
	}

	public String getDriverBusinessCity() {
		return DriverBusinessCity;
	}

	public void setDriverBusinessCity(String driverBusinessCity) {
		DriverBusinessCity = driverBusinessCity;
	}

	public String getDriverDrivingPercentage() {
		return DriverDrivingPercentage;
	}

	public void setDriverDrivingPercentage(String driverDrivingPercentage) {
		DriverDrivingPercentage = driverDrivingPercentage;
	}

	public Integer getDriverEducationCode() {
		return DriverEducationCode;
	}

	public void setDriverEducationCode(Integer driverEducationCode) {
		DriverEducationCode = driverEducationCode;
	}

	public Integer getDriverMedicalConditionCode() {
		return DriverMedicalConditionCode;
	}

	public void setDriverMedicalConditionCode(Integer driverMedicalConditionCode) {
		DriverMedicalConditionCode = driverMedicalConditionCode;
	}

	public String getDriverChildrenBelow16Years() {
		return DriverChildrenBelow16Years;
	}

	public void setDriverChildrenBelow16Years(String driverChildrenBelow16Years) {
		DriverChildrenBelow16Years = driverChildrenBelow16Years;
	}

	public String getDriverRelationship() {
		return DriverRelationship;
	}

	public void setDriverRelationship(String driverRelationship) {
		DriverRelationship = driverRelationship;
	}

	public Integer getDriverNOALast5Years() {
		return DriverNOALast5Years;
	}

	public void setDriverNOALast5Years(Integer driverNOALast5Years) {
		DriverNOALast5Years = driverNOALast5Years;
	}

	public Integer getDriverNOCLast5Years() {
		return DriverNOCLast5Years;
	}

	public void setDriverNOCLast5Years(Integer driverNOCLast5Years) {
		DriverNOCLast5Years = driverNOCLast5Years;
	}

	public Integer getDriverNCDFreeYears() {
		return DriverNCDFreeYears;
	}

	public void setDriverNCDFreeYears(Integer driverNCDFreeYears) {
		DriverNCDFreeYears = driverNCDFreeYears;
	}

	public String getDriverNCDReference() {
		return DriverNCDReference;
	}

	public void setDriverNCDReference(String driverNCDReference) {
		DriverNCDReference = driverNCDReference;
	}

	public Integer getDriverLicenses() {
		return DriverLicenses;
	}

	public void setDriverLicenses(Integer driverLicenses) {
		DriverLicenses = driverLicenses;
	}

	public Integer getDriverViolations() {
		return DriverViolations;
	}

	public void setDriverViolations(Integer driverViolations) {
		DriverViolations = driverViolations;
	}
}