package com.springboot.uber.services;

import com.springboot.uber.dto.DriverDto;
import com.springboot.uber.dto.RideDto;
import com.springboot.uber.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
