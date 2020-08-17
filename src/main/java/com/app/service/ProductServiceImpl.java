package com.app.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.exception.ResourceNotFoundException;
import com.app.model.Product;
import com.app.repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
@Autowired
	private ProductRepository productRepository;
	@Override
	public Product createProduct(Product product) {
	return	productRepository.save(product);
		
		
	}

	@Override
	public Product updateProduct(Product product,long productId) {
		Product productUpdatedObject=this.productRepository.findById(productId).orElseThrow(()-> new ResourceNotFoundException("product not found with given id : "+ productId) );
		
			
			
		productUpdatedObject.setName(product.getName());
		productUpdatedObject.setPrice(product.getPrice());
		productUpdatedObject.setDescription(product.getDescription());
			productRepository.save(productUpdatedObject);
			return product;
		
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductById(long productId) {
		Product productDb=this.productRepository.findById(productId).orElseThrow(()-> new ResourceNotFoundException("product not found with given id : "+ productId));
		return productDb;
	}

	@Override
	public void deleteProduct(long productId) {
		this.productRepository.deleteById(productId);
		
		
	}

}
