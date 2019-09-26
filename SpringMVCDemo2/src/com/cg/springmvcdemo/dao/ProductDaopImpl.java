package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;
@Repository("proddao")
public class ProductDaopImpl implements ProductDao {
List<Product> myList=new ArrayList<Product>();
	@Override
	public Product save(Product prod) {
		// TODO Auto-generated method stub
		myList.add(prod);
		
		return prod;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		
		
		return myList;
	}

	@Override
	public Product findByProductId(int prodId) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public void remove(int prodId) {
		// TODO Auto-generated method stub
		
		for(Product product:myList) {
			if(product.getProdId()==prodId) {
				myList.remove(product);
				break;
				
			}
			
		}
		
	}

}
