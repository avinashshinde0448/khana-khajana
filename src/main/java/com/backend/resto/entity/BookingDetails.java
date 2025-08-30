package com.backend.resto.entity;

import com.backend.resto.model.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingSeqGen")
    @SequenceGenerator(name = "bookingSeqGen", sequenceName = "booking_seq", allocationSize = 1)

    @Column(name = "booking_id")
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "booking_rest_fk" ,referencedColumnName = "rest_id")
    private RestaurantDetails restId;

    @ManyToOne
    @JoinColumn(name = "booking_user_fk" ,referencedColumnName = "user_id")
    private UserDetails userId;

    @Column(name = "table_id")
    private Integer tableId;

    @Column(name = "date")
    private LocalDate date;

  /*  @Column(name = "status")
    private BookingStatus status;*/

    @Column(name = "people")
    private String people;
}
