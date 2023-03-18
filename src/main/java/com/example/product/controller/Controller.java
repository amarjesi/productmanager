package com.example.product.controller;

import com.example.product.domain.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

  @Autowired
  ProductService productService;

  @PostMapping ("api/v1/updateProductStatus")
  public ResponseEntity<Product> updateProductStatus (@RequestBody Product product){
    return ResponseEntity.ok().body(productService.updateProductStatus(product));
  }

}