package com.example.demo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
