package com.muhammet.springbootdemo.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.muhammet.springbootdemo.business.abstracts.ProductService;
import com.muhammet.springbootdemo.entities.concrete.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return productService.getAll();
	}
	
	@GetMapping("/getbyid")
	public Product getByProductId(@RequestParam("id") int id) {
		return productService.getByProductId(id);
	}
	
	@GetMapping("/getbyname")
	public List<Product> getByProductName(@RequestParam("name") String name) {
		
		return productService.getByProductName(name);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@Valid @RequestBody Product product) {
		
		return productService.saveProduct(product);
	}
	@DeleteMapping("/delete")
public void deleteProduct( @RequestBody int id) {
		
		productService.deletedProduct(id);
	}

}
