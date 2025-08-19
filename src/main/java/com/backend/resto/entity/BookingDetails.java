package com.backend.resto.entity;

import jakarta.persistence.*;

@Entity
@Table
public class BookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingSeqGen")
    @SequenceGenerator(name = "bookingSeqGen", sequenceName = "booking_seq", allocationSize = 1)
    private int bookingId;
    private int restId;
    private int userId;
    private int tableId;
    private String open_time;
    private String close_time;
    private String status;
    private String people;
}
