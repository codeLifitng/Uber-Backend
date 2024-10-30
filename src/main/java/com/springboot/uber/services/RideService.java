package com.springboot.uber.services;

import com.springboot.uber.dto.RideRequestDto;
import com.springboot.uber.entities.Driver;
import com.springboot.uber.entities.Ride;
import com.springboot.uber.utils.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRideOfDriver(Long driverId, PageRequest pageRequest);
}
