package com.example.service.impl;

import com.example.config.Converter;
import com.example.dto.ProductDTO;
import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
//    @Override
//    public List<ProductDTO> showAll() {
//        List<Product> lp=productRepository.findAll();
//        //List<ProductDTO> lpo=lp.stream().map(h-> Converter.getProductDto(h)).toList();
//
//        List<ProductDTO> lpo=lp.stream().map(Converter::getProductDto).toList();
//
//        return  lpo;
//
//    }

    @Override
    public List<ProductDTO> showAll() {
        return  productRepository.findAll().stream().map(Converter::getProductDto).toList();

    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
//        Product saved=productRepository.save(Converter.getProduct(productDTO));
//        return Converter.getProductDto(saved);

        return Converter.getProductDto(productRepository.save(Converter.getProduct(productDTO)));


    }
}
