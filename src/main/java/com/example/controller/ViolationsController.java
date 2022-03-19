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

import com.example.entity.Violations;
import com.example.service.ViolationsService;

@RestController
@RequestMapping("/api/v1")
public class ViolationsController {

	@Autowired
	ViolationsService violationsService;

	@GetMapping("/violations")
    public ResponseEntity<List<Violations>> get(){
        List<Violations> violations = violationsService.findAll();
        return new ResponseEntity<List<Violations>>(violations, HttpStatus.OK);
    }

	@PostMapping("/violations")
    public ResponseEntity<Violations> save(@RequestBody Violations violations){
		Violations violationsOne = violationsService.save(violations);
        return new ResponseEntity<Violations>(violationsOne, HttpStatus.OK);
    }
}
