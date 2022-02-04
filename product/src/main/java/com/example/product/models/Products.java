package com.example.product.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Products")
public class Products {

    @Id
    private String id;
    private String name;
    private String type;
    private Integer numberCheck;
    private Double balance;

}
