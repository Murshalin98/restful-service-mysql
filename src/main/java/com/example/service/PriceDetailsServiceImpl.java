package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PriceDetails;
import com.example.repository.PriceDetailsRepository;

@Service
public class PriceDetailsServiceImpl implements PriceDetailsService {

	@Autowired
	PriceDetailsRepository priceDetailsRepository;

    @Override
    public List<PriceDetails> findAll() {
        return priceDetailsRepository.findAll();
    }

    @Override
    public PriceDetails save(PriceDetails priceDetails) {
    	priceDetailsRepository.save(priceDetails);
        return priceDetails;
    }
}