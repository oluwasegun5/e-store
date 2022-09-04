package com.example.estore.controllers;

import com.example.estore.dtos.UserRequestDto;
import com.example.estore.dtos.UserResponseDto;
import com.example.estore.models.enums.Membership;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/register")
    private UserResponseDto createUser(@RequestBody UserRequestDto requestDto){
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setFirstName(requestDto.getFirstName());
        responseDto.setLastName(requestDto.getLastName());
        responseDto.setEmail(requestDto.getEmail());
        responseDto.setPhoneNumber(requestDto.getPhoneNumber());
        responseDto.setDob(requestDto.getDob());
        responseDto.setMembership(Membership.BRONZE);
        return responseDto;
    }
}
