package com.example.clients.service;

import com.example.clients.model.ClientsEntity;
import com.example.clients.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ServiceClientsImpl implements ServiceClients{

    private final ClientRepository repository;

    @Override
    public Flux<ClientsEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<ClientsEntity> save(ClientsEntity clients) {
        return repository.save(clients);
    }
}
