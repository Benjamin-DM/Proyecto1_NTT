package com.example.movements.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Movements")
public class MovementsEntity {

    @Id
    private String id;
    private String name;
    private String type;
    private String category;
    private String client;
    private Double amount;
}
