package com.example.productmicroservice.mapper;

import com.example.productmicroservice.dto.ProductRequest;
import com.example.productmicroservice.dto.ProductResponse;
import com.example.productmicroservice.entity.ProductEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {
    public List<ProductResponse> dtoToEntity(List<ProductEntity> productEntities) {
        List<ProductResponse> responses = new ArrayList<>();
        for(ProductEntity p: productEntities){
            ProductResponse response = new ProductResponse();
            responses.add(toProductDto(p));
        }
        return responses;
    }

    private ProductResponse toProductDto(ProductEntity p) {
       return ProductResponse.builder()
                .id(p.getId())
                .name(p.getName())
                .description(p.getDescription())
                .unitPrice(p.getUnitPrice())
                .build();
    }

    public ProductEntity entityToDto(ProductRequest request) {
        return ProductEntity.builder()
                .name(request.getName())
                .description(request.getDescription())
                .unitPrice(request.getUnitPrice())
                .build();
    }
}
