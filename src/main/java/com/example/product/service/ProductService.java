package com.example.product.service;

import java.util.List;

import com.example.product.domain.Product;
import com.example.product.entity.ProductEntity;

public interface ProductService {
	public Product saveProduct(Product product);

	public List<ProductEntity> getAllProducts();

	public ProductEntity findProductById(long id) ;

	public ProductEntity updateProduct(ProductEntity p, long id) ;

	public void deleteProduct(long id);
}