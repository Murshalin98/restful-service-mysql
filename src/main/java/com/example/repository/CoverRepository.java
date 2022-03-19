package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Cover;

@Repository
public interface CoverRepository extends JpaRepository<Cover, Long> {
	
}