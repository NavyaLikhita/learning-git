package com.cg.springmvcdemo.service;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public List<Product> showProducts();
	
	public void removeData(int prodId);
	public Product search(int productId);
}
