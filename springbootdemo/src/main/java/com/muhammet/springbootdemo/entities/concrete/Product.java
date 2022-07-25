package com.muhammet.springbootdemo.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name="products")
@AllArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int productId;
	
	@Column(name="product_name")
	@NotNull
	@Size(min=2,message="Ürün isimi minimum 2 karakter olmalıdır!")
	private String productName;
	
	@Column(name="price")
	@NotNull
	private int price;
	
	@NotNull
	@Column(name="available")
	private boolean available;
	
	
	@Column(name="description")
	private String description;
	
	
	
	public Product() {
		
	}
}
