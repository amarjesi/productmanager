package com.example.product.service.impl;

import com.example.product.domain.Product;
import com.example.product.entity.ProductEntity;
import com.example.product.mapper.ProductMapper;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;

	@Override
	public Product saveProduct(Product product) {

	}

	@Override
	public List<ProductEntity> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public ProductEntity findProductById(long id)  {
		Optional<ProductEntity> prod = repository.findById(id);
	
			return prod.get();
	}

	@Override
	public ProductEntity updateProduct(ProductEntity p, long id) {
		ProductEntity prod = repository.findById(id).get();
		
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
