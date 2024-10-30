package com.springboot.uber.services.impl;

import com.springboot.uber.dto.DriverDto;
import com.springboot.uber.dto.SignupDto;
import com.springboot.uber.dto.UserDto;
import com.springboot.uber.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
