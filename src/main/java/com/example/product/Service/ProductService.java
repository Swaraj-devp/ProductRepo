package com.example.product.Service;

import com.example.product.dto.ProductRequestDTO;
import com.example.product.dto.ProductResponseDTO;
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
