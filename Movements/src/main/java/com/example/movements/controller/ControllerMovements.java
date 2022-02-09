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
    public Flux<MovementsEntity> getMovementsByAmount(@PathVariable("amount")String amount) {
        return service.findMovementsByAmount(amount);
    }

    @PostMapping("/post")
    Mono<MovementsEntity> postMovements (@RequestBody MovementsEntity movements) {

        return service.save(movements);
    }

    @PutMapping("/update")
    Mono<MovementsEntity> update (@RequestBody MovementsEntity movements ){
        return service.update(movements);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete (@PathVariable("id") String id){
        service.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
}
