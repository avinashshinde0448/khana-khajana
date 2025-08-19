package com.backend.resto.entity;

import jakarta.persistence.*;

@Entity
@Table
public class RestaurantDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restSseq")
    @SequenceGenerator(
            name = "restSeq",
            sequenceName = "restSeq",
            allocationSize = 1
    )
    private int restId;
    private String name;
    private String address;
    private String cuisine;
    private String open_time;
    private String close_time;
    private int noOfTables;
}
