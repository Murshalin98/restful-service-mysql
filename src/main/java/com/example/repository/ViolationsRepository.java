package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Violations;

@Repository
public interface ViolationsRepository extends JpaRepository<Violations, Long> {
	
}