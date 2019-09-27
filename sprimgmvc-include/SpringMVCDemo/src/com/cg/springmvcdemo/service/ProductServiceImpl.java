package com.cg.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.dao.ProductDao;
import com.cg.springmvcdemo.dto.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public List<Product> showProducts() {
		return productDao.showProducts();
	}

	@Override
	public Product searchProduct(int productId) {
		return productDao.searchProduct(productId);
	}

	@Override
	public boolean deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

}
