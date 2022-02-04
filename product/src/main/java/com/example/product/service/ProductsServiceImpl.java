package com.example.product.service;

import com.example.product.models.Products;
import com.example.product.repository.ProductsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductsServiceImpl implements IProductsService{

    @Autowired
    private ProductsDao productDao;

    @Override
    public Flux<Products> findAll() {
        return productDao.findAll();
    }

    @Override
    public Mono<Products> save(Products products) {
        return productDao.save(products);
    }

    @Override
    public Mono<Products> update(Products products) {
        return productDao.save(products);
    }

    @Override
    public Mono<Void> delete(String id) {
        return productDao.deleteById(id);
    }
}
