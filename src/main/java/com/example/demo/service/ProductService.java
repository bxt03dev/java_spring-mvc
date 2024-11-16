package com.example.demo.service;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProduct(){
        return this.productRepository.findAll();
    }

    public Product handleSaveProduct(Product product){
        Product savedProduct = this.productRepository.save(product);
        return savedProduct;
    }

//    public List<Product> fetchProducts(){
//        return this.productRepository.findAll();
//    }
    public Product getProductById(long id){
        return this.productRepository.findById(id);
    }

    public void deleteProductById(long id){
        this.productRepository.deleteById(id);
    }
}
