package com.example.sklepinternetowy.service;

import com.example.sklepinternetowy.model.Product;
import com.example.sklepinternetowy.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProduct (Long id){
        return productRepository.findById(id).orElse(null);
    }
    public void editProduct(Product product){
        productRepository.save(product);
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }




}
