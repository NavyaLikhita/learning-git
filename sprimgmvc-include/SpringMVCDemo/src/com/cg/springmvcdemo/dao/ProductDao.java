package com.cg.springmvcdemo.dao;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductDao {
	public Product addProduct(Product project);
	public List<Product> showProducts();
	public Product searchProduct(int productId);
	public boolean deleteProduct(int productId);

}
