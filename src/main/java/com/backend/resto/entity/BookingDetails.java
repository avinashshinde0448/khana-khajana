package com.backend.resto.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table
@Builder
public class BookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingSeqGen")
    @SequenceGenerator(name = "bookingSeqGen", sequenceName = "booking_seq", allocationSize = 1)

    @Column(name = "booking_id")
    private int bookingId;

    @Column(name = "rest_id")
    private int restId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "table_id")
    private int tableId;

    @Column(name = "open_time")
    private String open_time;

    @Column(name = "close_time")
    private String close_time;

    @Column(name = "status")
    private String status;

    @Column(name = "people")
    private String people;
}
