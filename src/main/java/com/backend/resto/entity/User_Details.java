package com.backend.resto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User_Details {
    @Id
    private int user_id;
    private String name;
    private String email;
    private String password;
}
