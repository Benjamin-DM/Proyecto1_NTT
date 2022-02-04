package com.example.clients.repository;

import com.example.clients.model.ClientsEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<ClientsEntity, String> {


}
