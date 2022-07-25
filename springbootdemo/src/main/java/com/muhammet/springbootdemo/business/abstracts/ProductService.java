package com.muhammet.springbootdemo.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.muhammet.springbootdemo.entities.concrete.Product;

public interface ProductService {
	public List<Product> getAll();
	public Product getByProductId(int id);
	List<Product> getByProductName(String name);
	ResponseEntity<String> saveProduct(Product product);
	void deletedProduct(int id);
}
