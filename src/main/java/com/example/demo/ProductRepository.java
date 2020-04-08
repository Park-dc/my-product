package com.example.demo;

import org.springframework.data.repository.CrudRepository;

//기본적으로 CRUD 추가됨
public interface ProductRepository extends CrudRepository <Product, Long> {
}
