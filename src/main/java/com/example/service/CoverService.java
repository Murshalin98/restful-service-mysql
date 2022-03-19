package com.example.service;

import java.util.List;

import com.example.entity.Cover;

public interface CoverService {

	List<Cover> findAll();

	Cover save(Cover cover);
}