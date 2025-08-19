package com.backend.resto.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen"
    )
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_seq",allocationSize = 1
    )
    private int userId;
    private String name;
    private String email;
    private String password;
}
