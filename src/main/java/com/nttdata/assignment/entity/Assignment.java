package com.nttdata.assignment.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class Assignment {
    @Id
    private String id;
    private String authorization;
    private Double maintenanceFee;
    private int movementLimit;
    private int creditsAllowed;
    private String idProduct;
    private String idClient;

}
