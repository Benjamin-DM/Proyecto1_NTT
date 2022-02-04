package com.example.clients.controller;

import com.example.clients.model.ClientsEntity;
import com.example.clients.service.ServiceClients;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ControllerClient {

    private final ServiceClients service;

    @GetMapping("/get")
    public Flux<ClientsEntity> getClient(){
        return service.findAll();
    }

    @PostMapping("/post")
    Mono<ClientsEntity> postClient(@RequestBody ClientsEntity clients){
        return service.save(clients);
    }

}
