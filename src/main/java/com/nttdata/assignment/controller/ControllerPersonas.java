package com.nttdata.assignment.controller;

import com.nttdata.assignment.entity.Assignment;
import com.nttdata.assignment.model.Client;
import com.nttdata.assignment.service.IAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/assignment")
public class ControllerPersonas {

    @Autowired
    IAssignmentService service;

    @GetMapping
    public Flux<Assignment> getPerson(){

        return service.findAll();

    }

    /*@GetMapping("/getPersonasByEdad/{edad}")
    public Flux<Assignment> getPersonasByEdad(@PathVariable("edad") int edad){

        return service.findPersonByEdad(edad);

    }*/

    @PostMapping
    Mono<Assignment> postPersona(@RequestBody Assignment persona){
        return service.save(persona);
    }

    @PutMapping
    Mono<Assignment> updPersonas(@RequestBody Assignment persona){
        return service.update(persona);
    }

    @DeleteMapping ("/{id}")
    void dltPersonas(@PathVariable("id") String id){
        service.delete(id);
    }

    @GetMapping("/clients/{assignmentId}")
    public Flux<Client> getClients(@PathVariable("assignmentId") String assignmentId){
        return service.getClients(assignmentId);
    }
}
