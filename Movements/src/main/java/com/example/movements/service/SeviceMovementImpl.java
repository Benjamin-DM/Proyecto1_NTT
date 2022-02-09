package com.example.movements.service;

import com.example.movements.model.MovementsEntity;
import com.example.movements.repository.MovementsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class SeviceMovementImpl implements ServiceMovements {

    private final MovementsRepository repository;

    @Override
    public Flux<MovementsEntity> findAll() {
        return null;
    }

    @Override
    public Flux<MovementsEntity> findClientsByName(String name) {
        return null;
    }

    @Override
    public Flux<MovementsEntity> findClientsByAmount(String type) {
        return null;
    }

    @Override
    public Mono<MovementsEntity> save(MovementsEntity movements) {
        return null;
    }

    @Override
    public Mono<MovementsEntity> update(MovementsEntity movements) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
