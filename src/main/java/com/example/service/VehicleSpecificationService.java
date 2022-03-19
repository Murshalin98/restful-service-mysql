package com.example.service;

import java.util.List;

import com.example.entity.VehicleSpecification;

public interface VehicleSpecificationService {

	List<VehicleSpecification> findAll();

	VehicleSpecification save(VehicleSpecification vehicleSpecification);
}
