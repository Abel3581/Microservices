package com.example.productmicroservice.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class ProductResponse {

    private String id;

    private String name;

    private String description;

    private Double unitPrice;
}
