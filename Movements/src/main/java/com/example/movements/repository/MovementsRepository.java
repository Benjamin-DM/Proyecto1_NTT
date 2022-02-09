package com.example.movements.repository;

import com.example.movements.model.MovementsEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovementsRepository extends ReactiveMongoRepository<MovementsEntity, String> {


}
