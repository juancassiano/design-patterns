package com.example.factory.transport;

import com.example.factory.vehicle.Bike;
import com.example.factory.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
  
}
