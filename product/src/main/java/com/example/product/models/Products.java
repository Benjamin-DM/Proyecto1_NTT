package com.example.product.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Document(collection = "Products")
public class Products {

    @Id
    private String id;
    private String typeProduct;
    private Integer accountNumber;
    private Double amount;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date createDate;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date updateDate;
    private Double creditLimit;

    //Mapear el service Client
    private Client client;

}
