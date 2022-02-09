package com.example.movements.controller;


import com.example.movements.model.MovementsEntity;
import com.example.movements.service.ServiceMovements;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

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
}
