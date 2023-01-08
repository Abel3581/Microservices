package com.example.productmicroservice.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
public class ProductRequest {

    private String name;

    private String description;

    private Double unitPrice;
}
