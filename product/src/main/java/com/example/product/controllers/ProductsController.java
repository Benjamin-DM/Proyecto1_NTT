package com.example.product.controllers;

import com.example.product.models.Products;
import com.example.product.service.IProductsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductsController {

    private final IProductsService productService;

    @GetMapping("/getProduct")
    public Flux<Products> getProduct(){
        log.info("iniciando lista");
        return productService.findAll();
    }
}
