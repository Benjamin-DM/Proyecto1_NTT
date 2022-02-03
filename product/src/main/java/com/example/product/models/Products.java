package com.example.product.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Products {

    @Id
    private Integer id;
    private String name;
    private String type;
    private Integer numberCheck;
    private Double balance;

}
