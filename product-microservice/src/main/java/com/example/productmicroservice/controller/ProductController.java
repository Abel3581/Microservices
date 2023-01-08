package com.example.productmicroservice.controller;

import com.example.productmicroservice.dto.ProductRequest;
import com.example.productmicroservice.dto.ProductResponse;
import com.example.productmicroservice.entity.ProductEntity;
import com.example.productmicroservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Patron de diseño decorador Restcontroller
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest request){
         productService.create(request);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
