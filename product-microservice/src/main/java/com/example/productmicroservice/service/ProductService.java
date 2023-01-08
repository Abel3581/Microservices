package com.example.productmicroservice.service;

import com.example.productmicroservice.dto.ProductRequest;
import com.example.productmicroservice.dto.ProductResponse;
import com.example.productmicroservice.entity.ProductEntity;
import com.example.productmicroservice.mapper.ProductMapper;
import com.example.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;
    public List<ProductResponse> getAllProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        return productMapper.dtoToEntity(productEntities);

    }
    public void create(ProductRequest request) {
        ProductEntity product = productMapper.entityToDto(request);
        productRepository.save(product);
    }
}
