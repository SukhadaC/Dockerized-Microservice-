package com.sukhada.Product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sukhada.Product.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{

}
