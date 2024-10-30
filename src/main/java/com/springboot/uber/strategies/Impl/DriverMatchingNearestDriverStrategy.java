package com.springboot.uber.strategies.Impl;

import com.springboot.uber.dto.RideRequestDto;
import com.springboot.uber.entities.Driver;
import com.springboot.uber.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
