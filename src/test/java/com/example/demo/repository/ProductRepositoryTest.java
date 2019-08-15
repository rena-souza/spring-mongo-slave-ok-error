package com.example.demo.repository;

import com.example.demo.domain.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void findByName() {
        Product product = new Product();
        product.setName("XPTO");
        product = productRepository.save(product);

        Product productFound = productRepository.findByName(product.getName());

        Assert.assertEquals(product.getId(), productFound.getId());
    }
}
