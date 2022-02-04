package com.example.product.repository;

import com.example.product.models.Products;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsDao  extends ReactiveMongoRepository<Products, String> {

}
