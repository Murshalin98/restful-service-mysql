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

import com.example.entity.Cover;
import com.example.service.CoverService;

@RestController
@RequestMapping("/api/v1")
public class CoverController {

	@Autowired
	CoverService coverService;

	@GetMapping("/cover")
    public ResponseEntity<List<Cover>> get(){
        List<Cover> cover = coverService.findAll();
        return new ResponseEntity<List<Cover>>(cover, HttpStatus.OK);
    }

	@PostMapping("/cover")
    public ResponseEntity<Cover> save(@RequestBody Cover cover){
		Cover coverOne = coverService.save(cover);
        return new ResponseEntity<Cover>(coverOne, HttpStatus.OK);
    }
}
