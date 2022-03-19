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

import com.example.entity.License;
import com.example.service.LicenseService;

@RestController
@RequestMapping("/api/v1")
public class LicenseController {

	@Autowired
	LicenseService licenseService;

	@GetMapping("/license")
    public ResponseEntity<List<License>> get(){
        List<License> license = licenseService.findAll();
        return new ResponseEntity<List<License>>(license, HttpStatus.OK);
    }

	@PostMapping("/license")
    public ResponseEntity<License> save(@RequestBody License license){
		License licenseOne = licenseService.save(license);
        return new ResponseEntity<License>(licenseOne, HttpStatus.OK);
    }
}
