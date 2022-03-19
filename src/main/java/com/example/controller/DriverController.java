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

import com.example.entity.Driver;
import com.example.service.DriverService;

@RestController
@RequestMapping("/api/v1")
public class DriverController {

	@Autowired
	DriverService driverService;

	@GetMapping("/driver")
    public ResponseEntity<List<Driver>> get(){
        List<Driver> driver = driverService.findAll();
        return new ResponseEntity<List<Driver>>(driver, HttpStatus.OK);
    }

	@PostMapping("/driver")
    public ResponseEntity<Driver> save(@RequestBody Driver driver){
		Driver driverOne = driverService.save(driver);
        return new ResponseEntity<Driver>(driverOne, HttpStatus.OK);
    }
}
