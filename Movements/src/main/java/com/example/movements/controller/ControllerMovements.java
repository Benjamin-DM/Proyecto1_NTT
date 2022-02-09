package com.example.movements.controller;


import com.example.movements.model.Mensaje;
import com.example.movements.model.MovementsEntity;
import com.example.movements.service.ServiceMovements;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/movements")
public class ControllerMovements {

    private final ServiceMovements service;

    @GetMapping("/get")
    public Flux<MovementsEntity> getMovements() {
        log.info("Iniciando lista");
        return service.findAll();
    }

    @GetMapping("/getName/{name}")
    public Flux<MovementsEntity> getMovementsByName(@PathVariable("name")String name) {
        return service.findMovementsByName(name);
    }

    @GetMapping("/getAmount/{amount}")
    public Flux<MovementsEntity> getMovementsByAmount(@PathVariable("amount") Double amount) {
        return service.findMovementsByAmount(amount);
    }

    @GetMapping("/getAmountName/{name}/{amount}")
    public Flux<MovementsEntity> findByNameAndAmount(@PathVariable("name")String name, @PathVariable("amount") Double amount) {
        return service.findByNameAndAmount(name, amount);
    }

    @PostMapping("/post")
    Mono<MovementsEntity> postMovements (@RequestBody MovementsEntity movements) {

        return service.save(movements);
    }
}
