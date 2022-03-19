package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.License;

@Repository
public interface LicenseRepository extends JpaRepository<License, Long> {
	
}