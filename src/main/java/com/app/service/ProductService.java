package com.app.service;

import java.util.List;

import com.app.model.Product;


public interface ProductService {
Product createProduct(Product produxt);
Product updateProduct(Product product,long porductID);
List<Product>getAllProduct();
Product getProductById(long productId);
void deleteProduct(long id);
}
