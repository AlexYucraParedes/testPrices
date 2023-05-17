package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Product;

public interface IProductRepository extends CrudRepository<Product, Long> {

}
