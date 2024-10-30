package com.springboot.uber.strategies;

import com.springboot.uber.dto.RideRequestDto;
import com.springboot.uber.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
