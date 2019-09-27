package com.cg.springmvcdemo.dao;





import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;
@Repository("proddao")
public class ProductDaoImpl implements ProductDao{
	@PersistenceContext
	EntityManager manager;
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		manager.persist(product);
		return product;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		Query query=manager.createQuery("FROM Product");
		List<Product> myList=query.getResultList();
		return myList;
	}

	

	@Override
	public void remove(int prodId) {
		// TODO Auto-generated method stub
		Product product=manager.find(Product.class, prodId);
		manager.remove(product);
		
		
	}

	@Override
	public Product search(int productId) {
		// TODO Auto-generated method stub
		Product product=manager.find(Product.class, productId);
		
		return product;
	}


	
	
}
