package com.nttdata.assignment.service;

import com.nttdata.assignment.entity.Assignment;
import com.nttdata.assignment.repository.IAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AssignmentServiceImpl implements IAssignmentService {

    @Autowired
    IAssignmentRepository repository;

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
}
