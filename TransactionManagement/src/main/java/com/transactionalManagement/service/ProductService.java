package com.transactionalManagement.service;

import java.util.List;

import com.transactionalManagement.model.Product;

public interface ProductService {

	public Product saveSingleProduct(Product product) ;
	public List<Product> saveListofProductProduct(List<Product> product ) ;
}
