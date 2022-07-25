package com.muhammet.springbootdemo.business.concretes;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muhammet.springbootdemo.business.abstracts.ProductService;
import com.muhammet.springbootdemo.dataAccess.abstracts.ProductDao;
import com.muhammet.springbootdemo.entities.concrete.Product;


@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}



	@Override
	public List<Product> getAll() {
		
		return productDao.findAll();
	}



	@Override
	public Product getByProductId(int id) {
		
		Optional<Product> productOptional=productDao.findById(id);
		Product product=null;
		if(productOptional.isPresent()) {
			product=productOptional.get();
		}
		else
			throw new RuntimeException("Böyle bir Id bulunmamaktadır : "+id);
		
		
		return product;
	}



	@Override
	public List<Product> getByProductName(String name) {
		
		return productDao.getByProductName(name);
	}



	@Override
	public ResponseEntity<String> saveProduct( Product product) {

		 productDao.save(product);
		return ResponseEntity.ok("Ürün Kaydedildi");
	}



	@Override
	public void deletedProduct(int id) {
		
		 productDao.delete(productDao.getByProductId(id));
		 

		 
		 
	}











}
