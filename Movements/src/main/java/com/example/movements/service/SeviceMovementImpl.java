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
        return repository.findAll();
    }

    @Override
    public Flux<MovementsEntity> findMovementsByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Flux<MovementsEntity> findMovementsByAmount(Double amount) {
        return repository.findByAmount(amount);
    }

    @Override
    public Flux<MovementsEntity> findByNameAndAmount(String name, Double amount){
        return repository.findByNameAndAmount(name, amount);
    }

    @Override
    public Mono<MovementsEntity> save(MovementsEntity movements) {
        return repository.save(movements);
    }

}
