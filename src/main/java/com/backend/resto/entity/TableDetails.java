package com.backend.resto.entity;

import jakarta.persistence.*;

@Entity
@Table
public class TableDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tableSeq")
    @SequenceGenerator(
            name = "tableSeq", sequenceName = "tableSeq", allocationSize = 1
    )
    int tableId;
    int restId;
    int seats ;
}
