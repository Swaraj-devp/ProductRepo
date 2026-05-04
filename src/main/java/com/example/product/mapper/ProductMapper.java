package com.example.product.mapper;

import com.example.product.dto.ProductRequestDTO;
import com.example.product.dto.ProductResponseDTO;
import com.example.product.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public  Product toEntity(ProductRequestDTO requestDTO) {
        Product product = new Product();
        product.setName(requestDTO.getName());
        product.setDescription(requestDTO.getDescription());
        product.setCategory(requestDTO.getCategory());
        product.setPrice(requestDTO.getPrice());
        return product;

    }

    public  ProductResponseDTO toResponseDTO(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getCategory(),
                product.getPrice()
        );
    }
}
