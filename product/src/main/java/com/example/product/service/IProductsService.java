package com.example.product.service;

import com.example.product.models.Products;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductsService {

        public Flux<Products> findAll();

        public Mono<Products> save(Products products);

        public Mono<Products> update(Products products);

        public Mono<Void> delete(String id);




}





