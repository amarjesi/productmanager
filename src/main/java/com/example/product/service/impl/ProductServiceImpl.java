package com.example.product.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepositoryInt;
import com.example.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepositoryInt repository;

	public ProductServiceImpl(ProductRepositoryInt repo) {
		super();
		this.repository = repo;
	}

	@Override
	public Product saveProduct(Product p) {
		return repository.save(p);
	}

	@Override
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public Product findProductById(long id)  {
		Optional<Product> prod = repository.findById(id);
	
			return prod.get();
	}

	@Override
	public Product updateProduct(Product p, long id) {
		Product prod = repository.findById(id).get();
		
			prod.setProductDescription(p.getProductDescription());
			prod.setProductName(p.getProductName());
			prod.setProductPrice(p.getProductPrice());
		
		repository.save(prod);
		return prod;

	}

	@Override
	public void deleteProduct(long id) {
		repository.deleteById(id);
	}
}
