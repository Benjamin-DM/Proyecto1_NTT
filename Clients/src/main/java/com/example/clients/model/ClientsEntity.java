package com.example.clients.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Clients")
public class ClientsEntity {

    @Id
    private String id;
    private String name;
    private String type;
    private String dni;
    private String phone;
    private String assignmentId;

}
