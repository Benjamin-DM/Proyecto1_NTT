package com.example.product.controllers;

import com.example.product.models.Products;
import com.example.product.service.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private IProductsService productService;

    @GetMapping("/getProduct")
    public Flux<Products> getProduct(){
        return productService.findAll();
    }
}
