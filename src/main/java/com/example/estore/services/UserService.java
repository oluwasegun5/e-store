package com.example.estore.services;

import com.example.estore.dtos.UserRequestDto;
import com.example.estore.dtos.UserDto;

public interface UserService {
    public UserDto createUser(UserRequestDto userRequestDto);
}
