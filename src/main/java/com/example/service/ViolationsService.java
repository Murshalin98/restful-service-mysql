package com.example.service;

import java.util.List;

import com.example.entity.Violations;

public interface ViolationsService {

	List<Violations> findAll();

	Violations save(Violations driver);
}