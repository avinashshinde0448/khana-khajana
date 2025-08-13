package com.backend.resto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Restaurant_Details {
    @Id
    private int rest_id;
    private String name;
    private String address;
    private String cuisine;
    private String open_time;
    private String close_time;
    private int no_of_tables;
}
