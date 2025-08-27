package com.backend.resto.service;

import com.backend.resto.entity.BookingDetails;
import com.backend.resto.model.BookingRequest;
import com.backend.resto.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }

    public String createBookingService(BookingRequest bookingRequest) {
        BookingDetails bookingDetails=BookingDetails.builder()
                .date(bookingRequest.getDate())
                .people(bookingRequest.getPeople())
                .status(bookingRequest.getStatus())
                .userId(bookingRequest.getUser_id())
                .restId(bookingRequest.getRest_id())
                .build();
        bookingRepository.save(bookingDetails);

        return "Created Booking";

    }
}
