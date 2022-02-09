package com.nttdata.assignment.service;

import com.nttdata.assignment.entity.Assignment;
import com.nttdata.assignment.model.Client;
import com.nttdata.assignment.repository.IAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AssignmentServiceImpl implements IAssignmentService {

    @Autowired
    IAssignmentRepository repository;

    WebClient webClientClient = WebClient.builder().baseUrl("http://localhost:8090").build();

    WebClient webClientProduct = WebClient.builder().baseUrl("http://localhost:8080").build();

    @Override
    public Flux<Assignment> findAll() {
        return repository.findAll();
    }

    /*@Override
    public Flux<Assignment> findPersonByEdad(int edad) {
        //return repository.findAll().filter(x -> x.getEdad() == edad); // 1 Metodo para realizar filtro por edad
        return repository.findByEdad(edad);
    }*/

    @Override
    public Mono<Assignment> save(Assignment persona) {
        return repository.save(persona);
    }

    @Override
    public Mono<Assignment> update(Assignment persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }

    @Override
    public Flux<Client> getClients(String assignmentId) {
        Flux<Client> clientFlux = webClientClient
                .get()
                .uri("/clients/byAssignment/{assignmentId}", assignmentId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Client.class);
        return clientFlux;
    }

}
