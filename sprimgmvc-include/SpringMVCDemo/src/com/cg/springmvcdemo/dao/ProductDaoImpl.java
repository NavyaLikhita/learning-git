package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	private List<Product> myList = new ArrayList<Product>();
	@Override
	public Product addProduct(Product product) {
		myList.add(product);
		return product;
	}

	@Override
	public List<Product> showProducts() {
		return myList;
	}

	@Override
	public Product searchProduct(int productId) {
		Iterator<Product> productIterator = myList.iterator();
		while(productIterator.hasNext()) {
			Product product = productIterator.next();
			if(product.getProductId()==productId) {
				return product;
			}
		}
		return null;
	}

	@Override
	public boolean deleteProduct(int productId) {
		Iterator<Product> productIterator = myList.iterator();
		while(productIterator.hasNext()) {
			Product product = productIterator.next();
			if(product.getProductId()==productId) {
				myList.remove(product);
				return true;
			}
		}
		return false;	}

}
