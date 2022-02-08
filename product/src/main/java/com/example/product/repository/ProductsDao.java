package com.example.product.repository;

import com.example.product.models.Products;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ProductsDao  extends ReactiveMongoRepository<Products, String> {

    //Buscar por tipo de producto pasivo / activo
    public Mono<Products> findByNameProduct(String nameProduct);

}
