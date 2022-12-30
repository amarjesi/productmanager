package com.example.product.controller;

import com.example.product.domain.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @Autowired
  ProductService productService;


  @PostMapping("/product")
  public ResponseEntity<Product> createProduct(@RequestBody Product requestBody123){

  return null;
  }
}