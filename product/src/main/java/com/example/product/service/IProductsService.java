package com.example.product.service;

import com.example.product.models.Products;
import reactor.core.publisher.Flux;

public interface IProductsService {

        public Flux<Products> findAll();
}
