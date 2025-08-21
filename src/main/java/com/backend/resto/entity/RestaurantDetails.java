package com.backend.resto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restSseq")
    @SequenceGenerator(
            name = "restSeq",
            sequenceName = "restSeq",
            allocationSize = 1
    )

    @Column(name = "rest_id" )
    private int restId;

    @Column(name ="name" )
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "cuisine")
    private String cuisine;

    @Column(name = "open_time")
    private String open_time;

    @Column(name ="close_time" )
    private String close_time;

    @Column(name = "no_of_tables")
    private int noOfTables;
}
