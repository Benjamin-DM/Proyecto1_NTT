package com.example.clients.service;

import ch.qos.logback.core.net.server.Client;
import com.example.clients.model.ClientsEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceClients {

    Flux<ClientsEntity> findAll();

    Flux<ClientsEntity> findClientsByName(String name);

    Flux<ClientsEntity> findClientsByType(String type);

    Mono<ClientsEntity> save(ClientsEntity clients);

    Mono<ClientsEntity> update(ClientsEntity clients);

    void delete(String Id);

}
