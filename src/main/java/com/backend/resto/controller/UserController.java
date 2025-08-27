package com.backend.resto.controller;

import com.backend.resto.entity.UserDetails;
import com.backend.resto.model.RegistrationRequest;
import com.backend.resto.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/test")
    public List<UserDetails> getUserDetails(){
        return userService.getuserservice();
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<UserDetails> getUserDetailsPath(@PathVariable(name="id") int id){
        return new ResponseEntity<>(userService.getuserbyid(id),HttpStatus.OK);
    }

    @GetMapping("/test/{ownername}/param")
    public ResponseEntity<String> getUserDetailsParam(@PathVariable(name="ownername") String name, @RequestParam("surname") String paramvalue){
        return new ResponseEntity<>("This is a API call for user details from param to " + name +" " + paramvalue, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> createUserRegistration(@RequestBody RegistrationRequest registrationRequest){
        return new ResponseEntity<>(this.userService.createuserregistration(registrationRequest),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateUserRegistration(@RequestBody RegistrationRequest registrationRequest){
        return new ResponseEntity<>(this.userService.updateuserregistration(registrationRequest),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteUserRegistration(@PathVariable String name){
        return new ResponseEntity<>(this.userService.deleteuserregistration(name),HttpStatus.OK);
    }
}
