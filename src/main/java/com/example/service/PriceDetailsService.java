package com.example.service;

import java.util.List;

import com.example.entity.PriceDetails;

public interface PriceDetailsService {

	List<PriceDetails> findAll();

	PriceDetails save(PriceDetails priceDetails);
}