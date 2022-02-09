package com.nttdata.assignment.repository;

import com.nttdata.assignment.entity.Assignment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAssignmentRepository extends ReactiveMongoRepository<Assignment, String> {

    //@Query("{'edad' : ?0}")
    //Flux<Assignment> findByEdad(int edad); // 2 Metodo para realizar el filtro por edad

}
