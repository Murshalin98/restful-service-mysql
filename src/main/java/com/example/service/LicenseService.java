package com.example.service;

import java.util.List;

import com.example.entity.License;

public interface LicenseService {

	List<License> findAll();

	License save(License license);
}