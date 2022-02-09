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
    public Flux<MovementsEntity> findMovementsByAmount(String type) {
        return repository.findByAmount(type);
    }

    @Override
    public Mono<MovementsEntity> save(MovementsEntity movements) {
        return repository.save(movements);
    }

    @Override
    public Mono<MovementsEntity> update(MovementsEntity movements) {
        return repository.save(movements);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();

    }
}
