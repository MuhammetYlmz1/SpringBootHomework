package com.muhammet.springbootdemo.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int productId;
	
	@Column(name="product_name")
	@NotBlank(message="Ürün ismi boş bırakılamaz")
	@Size(min=2,message="Ürün isimi minimum 2 karakter olmalıdır!")
	private String productName;
	
	@Column(name="price")
	@NotNull
	private int price;
	
	
	@Column(name="available")
	private boolean available;
	
	@NotEmpty
	@Column(name="description")
	private String description;
	
	

}
