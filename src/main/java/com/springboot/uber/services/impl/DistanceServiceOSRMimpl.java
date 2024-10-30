package com.springboot.uber.services.impl;

import com.springboot.uber.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMimpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}
