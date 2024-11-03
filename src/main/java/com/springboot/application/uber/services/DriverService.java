package com.springboot.application.uber.services;

import com.springboot.application.uber.dto.DriverDto;
import com.springboot.application.uber.dto.RideDto;
import com.springboot.application.uber.dto.RiderDto;
import com.springboot.application.uber.entities.Driver;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideRequestId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId, String otp);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

    Driver getCurrentDriver();
}
