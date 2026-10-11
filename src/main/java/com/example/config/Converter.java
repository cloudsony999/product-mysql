package com.example.config;

import com.example.dto.ProductDTO;
import com.example.entity.Product;

public class Converter {

    public static ProductDTO getProductDto(Product product)
    {
        return new ProductDTO(product.getId(),product.getName(),product.getPrice());
    }

    public static Product getProduct(ProductDTO productDto)
    {
        return new Product(productDto.getId(),productDto.getName(),productDto.getPrice());
    }
}
