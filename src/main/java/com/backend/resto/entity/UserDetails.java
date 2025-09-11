package com.backend.resto.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;


@Data
@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_seq",allocationSize = 1)

    @Column(name = "user_id")
    private int userId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private BigInteger phoneNumber;
}
