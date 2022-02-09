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
    public Flux<ClientsEntity> findClientsByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Flux<ClientsEntity> findClientsByType(String type) {
        return repository.findByType(type);
    }

    @Override
    public Mono<ClientsEntity> save(ClientsEntity clients) {

        return repository.save(clients);
    }

    @Override
    public Mono<ClientsEntity> update(ClientsEntity clients) {

        return repository.save(clients);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }



}
