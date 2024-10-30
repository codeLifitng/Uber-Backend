package com.springboot.uber.dto;

import com.springboot.uber.entities.Rider;
import com.springboot.uber.utils.enums.PaymentMethod;
import com.springboot.uber.utils.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private Long id;

    private Point pickupLocation;

    private Point dropOfLocation;

    private LocalDateTime requestedTime;

    private Rider rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;

}
