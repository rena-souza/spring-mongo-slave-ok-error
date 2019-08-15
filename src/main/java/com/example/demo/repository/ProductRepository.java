package com.example.demo.repository;

import com.example.demo.domain.Product;
import org.springframework.data.mongodb.core.query.Meta.CursorOption;
import org.springframework.data.mongodb.repository.Meta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Meta(flags = CursorOption.SLAVE_OK)
    Product findByName(String name);

}
