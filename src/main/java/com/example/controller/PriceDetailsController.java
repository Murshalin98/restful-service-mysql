package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PriceDetails;
import com.example.service.PriceDetailsService;

@RestController
@RequestMapping("/api/v1")
public class PriceDetailsController {

	@Autowired
	PriceDetailsService priceDetailsService;

	@GetMapping("/pricedetails")
    public ResponseEntity<List<PriceDetails>> get(){
        List<PriceDetails> priceDetails = priceDetailsService.findAll();
        return new ResponseEntity<List<PriceDetails>>(priceDetails, HttpStatus.OK);
    }

	@PostMapping("/pricedetails")
    public ResponseEntity<PriceDetails> save(@RequestBody PriceDetails priceDetails){
		PriceDetails priceDetailsOne = priceDetailsService.save(priceDetails);
        return new ResponseEntity<PriceDetails>(priceDetailsOne, HttpStatus.OK);
    }
}
