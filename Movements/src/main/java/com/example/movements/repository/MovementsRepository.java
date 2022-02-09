package com.example.movements.repository;

import com.example.movements.model.MovementsEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MovementsRepository extends ReactiveMongoRepository<MovementsEntity, String> {

    Flux<MovementsEntity> findByName(String name);
    Flux<MovementsEntity> findByAmount(Double amount);

    Flux<MovementsEntity> findByNameAndAmount(String name, Double amount);

}
