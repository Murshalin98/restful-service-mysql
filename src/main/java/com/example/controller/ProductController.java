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

import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/product")
    public ResponseEntity<List<Product>> get(){
        List<Product> product = productService.findAll();
        return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
    }

	@PostMapping("/product")
    public ResponseEntity<Product> save(@RequestBody Product product){
		Product productOne = productService.save(product);
        return new ResponseEntity<Product>(productOne, HttpStatus.OK);
    }
}
