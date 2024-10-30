package com.springboot.uber.strategies;

import com.springboot.uber.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
