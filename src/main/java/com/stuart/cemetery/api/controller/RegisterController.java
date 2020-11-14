package com.stuart.cemetery.api.controller;

import com.stuart.cemetery.api.dto.UserDto;
import com.stuart.cemetery.api.dto.responses.ServerResponse;
import com.stuart.cemetery.api.model.User;
import com.stuart.cemetery.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {


    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<ServerResponse> register(@RequestBody UserDto userDto){
        User user = new User(
                userDto.getEmail(),
                userDto.getUserName(),
                passwordEncoder.encode(userDto.getPassword()),
                true,
                "USER"
        );

        userRepository.save(user);

        return new ResponseEntity<>(new ServerResponse("Successfully registered", true), HttpStatus.OK);
    }



}
