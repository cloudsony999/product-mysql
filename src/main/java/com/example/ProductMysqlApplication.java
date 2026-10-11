package com.example;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductMysqlApplication implements CommandLineRunner {

	private ProductRepository productRepository;


	public ProductMysqlApplication(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductMysqlApplication.class, args);
	}

	@Override
	public void run(String @NonNull ... args) throws Exception {

     		productRepository.saveAll(
				List.of(
						Product.builder().name("mobile").price(70000.0).build(),
						Product.builder().name("tv").price(71000.0).build(),
						Product.builder().name("table").price(7000.0).build(),
						Product.builder().name("chair").price(700.0).build()

				)
		);
			 IO.println("================all saved===================");

	}
}
