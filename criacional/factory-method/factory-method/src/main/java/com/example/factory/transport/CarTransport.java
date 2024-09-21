package com.example.factory.transport;

import com.example.factory.vehicle.Car;
import com.example.factory.vehicle.IVehicle;

public class CarTransport extends Transport {

  @Override
  protected IVehicle createTransport() {
    return new Car();
  }
  
}
