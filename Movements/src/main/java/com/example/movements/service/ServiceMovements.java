package com.example.movements.service;

import com.example.movements.model.MovementsEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceMovements {

    Flux<MovementsEntity> findAll();

    Flux<MovementsEntity> findClientsByName(String name);

    Flux<MovementsEntity> findClientsByAmount(String type);

    Mono<MovementsEntity> save(MovementsEntity movements);

    Mono<MovementsEntity> update(MovementsEntity movements);

    void delete(String id);
}
