package com.springboot.uber.strategies.Impl;

import com.springboot.uber.dto.RideRequestDto;
import com.springboot.uber.entities.Driver;
import com.springboot.uber.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
