package com.backend.resto.model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RestaurantRequest {
    private int id;
    private String name;
    private String address;
    private String cuisine;
    private String open_time;
    private String close_time;
    private int noOfTables;
}
