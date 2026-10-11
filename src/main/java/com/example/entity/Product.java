package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name="productlist")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pid")
    private Integer id;
    @Column(name="pname",unique = true,length = 10)
    private String name;
    @Column(name="pprice")
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
