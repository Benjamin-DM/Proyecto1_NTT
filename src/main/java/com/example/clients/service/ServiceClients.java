package com.example.clients.service;

import com.example.clients.model.ClientsEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceClients {

    Flux<ClientsEntity> findAll();

    Mono<ClientsEntity> save(ClientsEntity clients);

}
