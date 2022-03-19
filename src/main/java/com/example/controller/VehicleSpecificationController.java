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

import com.example.entity.VehicleSpecification;
import com.example.service.VehicleSpecificationService;

@RestController
@RequestMapping("/api/v1")
public class VehicleSpecificationController {

	@Autowired
	VehicleSpecificationService vehicleSpecificationService;

	@GetMapping("/vehiclespecification")
    public ResponseEntity<List<VehicleSpecification>> get(){
        List<VehicleSpecification> specification = vehicleSpecificationService.findAll();
        return new ResponseEntity<List<VehicleSpecification>>(specification, HttpStatus.OK);
    }

	@PostMapping("/vehiclespecification")
    public ResponseEntity<VehicleSpecification> save(@RequestBody VehicleSpecification specification){
		VehicleSpecification specificationOne = vehicleSpecificationService.save(specification);
        return new ResponseEntity<VehicleSpecification>(specificationOne, HttpStatus.OK);
    }
}
