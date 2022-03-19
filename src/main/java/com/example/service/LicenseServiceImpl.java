package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.License;
import com.example.repository.LicenseRepository;

@Service
public class LicenseServiceImpl implements LicenseService {

	@Autowired
	LicenseRepository licenseRepository;

    @Override
    public List<License> findAll() {
        return licenseRepository.findAll();
    }

    @Override
    public License save(License license) {
    	licenseRepository.save(license);
        return license;
    }
}