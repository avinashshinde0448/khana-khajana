package com.backend.resto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Table_Details {
    @Id
    int table_id;
    int rest_id;
    int seats ;
}
