package com.transactionalManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.transactionalManagement.exceptions.CustomUsernameNotFoundException;
import com.transactionalManagement.exceptions.TransactionManagementCheck;
import com.transactionalManagement.model.Product;
import com.transactionalManagement.repository.ProductRepo;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

	private final ProductRepo productRepo;
	
	@Override
	public Product saveSingleProduct(Product product) {
		Product savedproduct = productRepo.save(product);
		return savedproduct;
	}

	@Override
	@Transactional(rollbackOn = TransactionManagementCheck.class) // Rollback on any RuntimeException
	public List<Product> saveListofProductProduct(List<Product> products) {
	    try {
	        for (int i = 0; i < products.size(); i++) {
	            if (i == 5) {
	                throw new CustomUsernameNotFoundException();
	            }
	            saveSingleProduct(products.get(i));
	        }
	        return products;
	    } catch (CustomUsernameNotFoundException e) {
	        e.printStackTrace();
	        return null;
	        // Optionally, you can re-throw the exception here if you want it to propagate further
	        // throw e;
	    }
	}
}
//List<Product> savedproduct = productRepo.saveAll(product);

