package com.stuart.cemetery.api.controller;


import com.stuart.cemetery.api.dto.UserDto;
import com.stuart.cemetery.api.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    MyUserDetailService myUserDetailService;


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto userDto){


        try{
            System.out.println(userDto.getUserName());
            UserDetails user = myUserDetailService.loadUserByUsername(userDto.getUserName());
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = user.getPassword();

            if(passwordEncoder.matches(userDto.getPassword(),encodedPassword )){
                return new ResponseEntity<>("Successfully logged in ", HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Invalid username or password", HttpStatus.UNAUTHORIZED);
            }

        }catch (UsernameNotFoundException usernameNotFoundException) {
            System.out.println("In catch block user does not exits");
            System.out.println(new ResponseEntity<>("Failed", HttpStatus.UNAUTHORIZED));
            return new ResponseEntity<>("Invalid username or password" , HttpStatus.UNAUTHORIZED);
        }
    }
}
