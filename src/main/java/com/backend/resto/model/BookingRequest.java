package com.backend.resto.model;

import com.backend.resto.entity.RestaurantDetails;
import com.backend.resto.entity.UserDetails;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class BookingRequest {

    private Integer user_id;
    private Integer rest_id;
    private LocalDate date;
    private String people;



}
