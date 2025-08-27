package com.backend.resto.service;

import com.backend.resto.entity.RestaurantDetails;
import com.backend.resto.model.RestaurantRequest;
import com.backend.resto.repository.RestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RestaurantService {
    private RestaurantRepository restaurantRepository;
    RestaurantService(RestaurantRepository restaurantRepository){
        this.restaurantRepository=restaurantRepository;
    }

    public String createRestoService(RestaurantRequest restaurantRequest) {
        RestaurantDetails restaurantDetails= RestaurantDetails.builder().
                name(restaurantRequest.getName())
                .address(restaurantRequest.getAddress())
                .cuisine(restaurantRequest.getCuisine())
                .noOfTables(restaurantRequest.getNoOfTables()).build();
        restaurantRepository.save(restaurantDetails);

        return "Created";
    }

    public String updateRestoService(RestaurantRequest restaurantRequest) {
        RestaurantDetails restaurantDetails=restaurantRepository.getByName(restaurantRequest.getName());

        restaurantDetails.setAddress(restaurantRequest.getAddress());
        restaurantDetails.setNoOfTables(restaurantRequest.getNoOfTables());
        restaurantDetails.setCuisine(restaurantRequest.getCuisine());
        restaurantRepository.save(restaurantDetails);
        return "Updated";

    }

    public String deleteRestoService(String name) {
        RestaurantDetails restaurantDetails=restaurantRepository.getByName(name);

        restaurantRepository.delete(restaurantDetails);
        return "deleted";
    }

    public List<RestaurantDetails> getRestaurantDetails() {
        return restaurantRepository.findAll();
    }

    public RestaurantDetails getRestaurantDetailsById(int id) {
        return restaurantRepository.findById(id).get();
    }
}
