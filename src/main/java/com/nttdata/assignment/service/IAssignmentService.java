package com.nttdata.assignment.service;

import com.nttdata.assignment.entity.Assignment;
import com.nttdata.assignment.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAssignmentService {
    Flux<Assignment> findAll();

    //Flux<Assignment> findPersonByEdad(int edad);

    Mono<Assignment> save(Assignment assignment);

    Mono<Assignment> update(Assignment assignment);

    void delete(String id);

    Flux<Client> getByClients(String assignmentId);

}
