package com.example.clients.controller;

import com.example.clients.model.ClientsEntity;
import com.example.clients.service.ServiceClients;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/getName")
    public Flux<ClientsEntity> getClientByName(@PathVariable("name") String name){
        return service.findClientsByName(name);
    }

    @GetMapping("/getType")
    public Flux<ClientsEntity> getClientByType(@PathVariable("type") String type){
        return service.findClientsByType(type);
    }

    @PostMapping("/post")
    Mono<ClientsEntity> postClient(@RequestBody ClientsEntity clients){

        return service.save(clients);
    }

    @PostMapping("/update")
    Mono<ClientsEntity> update (@RequestBody ClientsEntity clients ){
        return service.update(clients);
    }

    @PostMapping("/delete/{Id}")
    void delete (@PathVariable("Id") String Id){
       service.delete(Id);
    }
}
