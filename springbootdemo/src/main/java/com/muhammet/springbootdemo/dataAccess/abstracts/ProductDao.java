package com.muhammet.springbootdemo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.muhammet.springbootdemo.entities.concrete.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	Product getByProductId(int id);
	List<Product> getByProductName(String name);
	void deleteByProductId(int id);
	
	
}
