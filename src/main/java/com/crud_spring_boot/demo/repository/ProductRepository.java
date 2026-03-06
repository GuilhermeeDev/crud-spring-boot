package com.crud_spring_boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud_spring_boot.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {    
}
