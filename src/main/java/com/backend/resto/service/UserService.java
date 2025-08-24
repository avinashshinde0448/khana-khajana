package com.backend.resto.service;

import com.backend.resto.model.RegistrationRequest;
import com.backend.resto.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.backend.resto.entity.UserDetails;

import java.util.List;

@Slf4j
@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;
    UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }



    public String createuserregistration(RegistrationRequest createRequest) {
        log.info("Registration Request {}",createRequest);
        UserDetails userDetails =new UserDetails();
        userDetails.setName(createRequest.getName());
        userDetails.setEmail(createRequest.getEmail());
        userDetails.setPhoneNumber(createRequest.getPhoneNumber());
        userDetails.setPassword(createRequest.getPassword());

        userRepository.save(userDetails);

        return "Created";
    }

    public String updateuserregistration(RegistrationRequest updateRequest) {
        log.warn("Registration Update Request {}",updateRequest);

        UserDetails userDetails=userRepository.findByEmail(updateRequest.getEmail());

       // userDetails.setName(updateRequest.getName());
        userDetails.setPassword(updateRequest.getPassword());
        userRepository.save(userDetails);
        return "Updated";
    }

    public String deleteuserregistration(String name) {
        log.error("Delete User {}",name);
        UserDetails userDetails=userRepository.findByName(name);
        userRepository.delete(userDetails);
        return "Deleted";


    }


    public List<UserDetails> getuserservice() {
         return userRepository.findAll();
    }

    public UserDetails getuserbyid(int id) {
        return this.userRepository.findById(id).get();
    }
}
