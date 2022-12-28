package com.example.product.service;

import java.util.List;

import com.example.product.entity.Product;

public interface ProductService {
	public Product saveProduct(Product p);

	public List<Product> getAllProducts();

	public Product findProductById(long id) ;

	public Product updateProduct(Product p, long id) ;

	public void deleteProduct(long id);
}