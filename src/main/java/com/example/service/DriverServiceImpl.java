package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Driver;
import com.example.repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepository driverRepository;

    @Override
    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    @Override
    public Driver save(Driver driver) {
    	driverRepository.save(driver);
        return driver;
    }
}