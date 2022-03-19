package com.example.service;

import java.util.List;

import com.example.entity.Driver;

public interface DriverService {

	List<Driver> findAll();

	Driver save(Driver driver);
}