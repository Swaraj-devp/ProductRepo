package com.example.demo.Service;

import com.example.demo.dto.ProductRequestDTO;
import com.example.demo.dto.ProductResponseDTO;
import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;


public interface ProductService {

    ProductResponseDTO createProduct(ProductRequestDTO requestDTO);

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO requestDTO);

    void deleteProduct(Long id);

    ProductResponseDTO getProductbyId(Long id);

    List<ProductResponseDTO> getAllProducts();

    Page<ProductResponseDTO> getProductsWithPagination(int page, int size);
}
