package com.example.product_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")

public class product {
    private int id;
    private int procode;
    private String proname;
    private String date;
    private String expirydate;
    private String brand;
    private int price;
    private String sellername;
    private String distname;
}
