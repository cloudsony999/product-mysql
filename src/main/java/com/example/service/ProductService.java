package com.example.service;

import com.example.dto.ProductDTO;
import com.example.entity.Product;

import java.util.List;

public interface ProductService {
    List<ProductDTO> showAll();

    ProductDTO createProduct(ProductDTO productDTO);


}
