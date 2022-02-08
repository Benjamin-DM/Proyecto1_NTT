package com.example.clients.repository;

import com.example.clients.model.ClientsEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<ClientsEntity, String> {

    Flux<ClientsEntity> findByName(String name);
    Flux<ClientsEntity> findByType(String type);
}
