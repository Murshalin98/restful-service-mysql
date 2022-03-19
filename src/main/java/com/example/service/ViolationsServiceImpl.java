package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Violations;
import com.example.repository.ViolationsRepository;

@Service
public class ViolationsServiceImpl implements ViolationsService {

	@Autowired
	ViolationsRepository violationsRepository;

    @Override
    public List<Violations> findAll() {
        return violationsRepository.findAll();
    }

    @Override
    public Violations save(Violations violations) {
    	violationsRepository.save(violations);
        return violations;
    }
}