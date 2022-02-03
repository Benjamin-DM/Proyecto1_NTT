package com.example.product.service;

import com.example.product.models.Products;
import reactor.core.publisher.Flux;

public interface ProductsService {

        public Flux<Products> findAll();
}
