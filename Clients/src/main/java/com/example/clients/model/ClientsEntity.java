package com.example.clients.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("Clients")
public class ClientsEntity {

    @Id
    private String Id;
    private String Name;
    private String Type;
    private String Categories;
    private String DNI;
    private String Phone;

}
