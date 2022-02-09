package com.example.clients.controller;

import com.example.clients.model.ClientsEntity;
import com.example.clients.model.Mensaje;
import com.example.clients.service.ServiceClients;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ControllerClient {

    private final ServiceClients service;

    @GetMapping("/get")
    public Flux<ClientsEntity> getClient(){
        log.info("Iniciando lista");
        return service.findAll();
    }

    @GetMapping("/getName/{name}")
    public Flux<ClientsEntity> getClientByName(@PathVariable("name") String name){
        return service.findClientsByName(name);
    }

    @GetMapping("/getType/{type}")
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

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete (@PathVariable("id") String id) {
    service.delete(id);
    return new ResponseEntity(new Mensaje("producto eliminado"),HttpStatus.OK);
    }
}
