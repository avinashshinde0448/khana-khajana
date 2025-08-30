package com.backend.resto.service;

import com.backend.resto.entity.BookingDetails;
import com.backend.resto.entity.RestaurantDetails;
import com.backend.resto.entity.UserDetails;
import com.backend.resto.model.BookingRequest;
import com.backend.resto.repository.BookingRepository;
import com.backend.resto.repository.RestaurantRepository;
import com.backend.resto.repository.UserRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    private UserRepository userRepository;

    private RestaurantRepository restaurantRepository;

    public BookingService(UserRepository userRepository, BookingRepository bookingRepository, RestaurantRepository restaurantRepository){
        this.userRepository=userRepository;
        this.bookingRepository=bookingRepository;
        this.restaurantRepository=restaurantRepository;
    }


    public String createBookingService(BookingRequest bookingRequest) {

        UserDetails userDetails=userRepository.findById(bookingRequest.getUser_id()).get();
        RestaurantDetails restaurantDetails=restaurantRepository.findById(bookingRequest.getRest_id()).get();
        BookingDetails bookingDetails=BookingDetails.builder()
                .date(bookingRequest.getDate())
                .people(bookingRequest.getPeople())
                .userId(userDetails)
                .restId(restaurantDetails)
                .build();
        bookingRepository.save(bookingDetails);

        return "Created Booking";

    }

    public String deleteBookingService(int id) {
        BookingDetails bookingDetails=bookingRepository.findById(id).get();
        bookingRepository.delete(bookingDetails);
        return "Booking Deleted";
    }

    public List<BookingDetails> getAllBookingsService() {
        return this.bookingRepository.findAll();
    }

    public BookingDetails getBookingByIdService(int id) {
        return this.bookingRepository.findById(id).get();
    }
}
