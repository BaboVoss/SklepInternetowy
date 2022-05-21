package com.example.sklepinternetowy.repository;

import com.example.sklepinternetowy.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {
}
