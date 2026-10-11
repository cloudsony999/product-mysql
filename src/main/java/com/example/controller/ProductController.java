package com.example.controller;

import com.example.dto.ProductDTO;
import com.example.entity.Product;
import com.example.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAll()
    {
        return ResponseEntity.ok(productService.showAll());
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createNewProduct(@RequestBody ProductDTO productDTO)
    {
        return new ResponseEntity<>(productService.createProduct(productDTO), HttpStatus.CREATED);

    }

}
