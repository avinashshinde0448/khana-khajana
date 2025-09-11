package com.backend.resto.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class RegistrationRequest {

    private String name;
    private String email;
    private String password;
    private BigInteger phoneNumber;
}
