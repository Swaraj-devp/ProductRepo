package com.example.demo.Controller;

import com.example.demo.Service.ProductService;
import com.example.demo.dto.ProductRequestDTO;
import com.example.demo.dto.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(
            @RequestBody ProductRequestDTO requestDTO) {

        ProductResponseDTO response =productService.createProduct(requestDTO);

        return ResponseEntity.status(201).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> updateProduct(@PathVariable Long id,
            @RequestBody ProductRequestDTO requestDTO) {

        ProductResponseDTO response =productService.updateProduct(id,requestDTO);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);

        return ResponseEntity.ok().body("Product deleted Successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable Long id) {
        ProductResponseDTO response = productService.getProductbyId(id);

            return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts() {
        List<ProductResponseDTO> products = productService.getAllProducts();

        return ResponseEntity.ok(products);
    }

    @GetMapping("/page")
    public ResponseEntity<Page<ProductResponseDTO>> getProductsWithPagination(
            @RequestParam int page,
            @RequestParam int size) {

        Page<ProductResponseDTO> response =
                productService.getProductsWithPagination(page, size);

        return ResponseEntity.ok(response);
    }
}
