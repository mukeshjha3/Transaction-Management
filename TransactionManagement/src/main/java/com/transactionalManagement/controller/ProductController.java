package com.transactionalManagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transactionalManagement.model.Product;
import com.transactionalManagement.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProductController {

	private final ProductService productService;
	
	@PostMapping("/savesingle")
	public String saveSingleProduct(@RequestBody Product product) {
		productService.saveSingleProduct(product);
		return "Product has been saved successfully";
	}
	
	@PostMapping("/savelist")
	public String saveListOfProduct(@RequestBody List<Product> product) {
		for (Product product2 : product) {
			System.out.println(product2);
		}
		productService.saveListofProductProduct(product);
		return "Product List has been saved successfully";
	}
}
