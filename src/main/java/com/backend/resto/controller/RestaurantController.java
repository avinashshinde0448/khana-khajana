package com.backend.resto.controller;

import com.backend.resto.entity.RestaurantDetails;
import com.backend.resto.model.RestaurantRequest;
import com.backend.resto.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/resto")
public class RestaurantController {

    private RestaurantService restaurantService;

    RestaurantController(RestaurantService restaurantService){
        this.restaurantService=restaurantService;
    }


    @GetMapping("/test")
    public List<RestaurantDetails> getRestaurantDetails(){
        return restaurantService.getRestaurantDetails();
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<RestaurantDetails> getRestaurantById(@PathVariable int id){
        return new ResponseEntity<>(this.restaurantService.getRestaurantDetailsById(id),HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> createRestaurantDetails(@RequestBody RestaurantRequest restaurantRequest){

        return new ResponseEntity<>(this.restaurantService.createRestoService(restaurantRequest), HttpStatus.OK);

    }

    @PutMapping("/update")
    public ResponseEntity<String> updateRestaurantDetails(@RequestBody RestaurantRequest restaurantRequest){
        return new ResponseEntity<>(this.restaurantService.updateRestoService(restaurantRequest),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteRestaurantDetails(@PathVariable String name){
        return new ResponseEntity<>(this.restaurantService.deleteRestoService(name),HttpStatus.OK);
    }
}
