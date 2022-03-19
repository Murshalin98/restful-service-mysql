package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.VehicleSpecification;
import com.example.repository.VehicleSpecificationRepository;

@Service
public class VehicleSpecificationServiceImpl implements VehicleSpecificationService {

	@Autowired
	VehicleSpecificationRepository vehicleSpecificationRepository;

    @Override
    public List<VehicleSpecification> findAll() {
        return vehicleSpecificationRepository.findAll();
    }

    @Override
    public VehicleSpecification save(VehicleSpecification vehicleSpecification) {
    	vehicleSpecificationRepository.save(vehicleSpecification);
        return vehicleSpecification;
    }
}