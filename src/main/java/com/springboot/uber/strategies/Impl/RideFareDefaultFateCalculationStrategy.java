package com.springboot.uber.strategies.Impl;

import com.springboot.uber.dto.RideRequestDto;
import com.springboot.uber.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFateCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
