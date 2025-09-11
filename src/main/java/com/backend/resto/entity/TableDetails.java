package com.backend.resto.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table
@Builder
public class TableDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tableSeq")
    @SequenceGenerator(
            name = "tableSeq", sequenceName = "tableSeq", allocationSize = 1
    )
    @Column(name = "table_id")
    int tableId;

    @Column(name = "rest_id")
    int restId;

    @Column(name = "seats")
    int seats ;
}
