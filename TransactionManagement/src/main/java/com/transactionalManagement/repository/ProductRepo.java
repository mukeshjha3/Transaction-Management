package com.transactionalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transactionalManagement.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String>{

}
