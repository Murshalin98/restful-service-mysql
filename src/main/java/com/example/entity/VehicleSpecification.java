package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class VehicleSpecification {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer VehicleSpecificationCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVehicleSpecificationCode() {
		return VehicleSpecificationCode;
	}

	public void setVehicleSpecificationCode(Integer vehicleSpecificationCode) {
		VehicleSpecificationCode = vehicleSpecificationCode;
	}
}
