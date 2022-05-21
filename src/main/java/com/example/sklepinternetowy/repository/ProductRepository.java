package com.example.sklepinternetowy.repository;

import com.example.sklepinternetowy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
