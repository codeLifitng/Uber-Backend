package com.springboot.uber.dto;

import com.springboot.uber.entities.Driver;
import com.springboot.uber.entities.Rider;
import com.springboot.uber.utils.enums.PaymentMethod;
import com.springboot.uber.utils.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {

    private Long id;

    private Point pickupLocation;

    private Point dropOfLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
