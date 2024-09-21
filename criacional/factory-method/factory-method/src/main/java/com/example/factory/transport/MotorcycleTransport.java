package com.example.factory.transport;

import com.example.factory.vehicle.IVehicle;
import com.example.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{

  @Override
  protected IVehicle createTransport() {
    return new Motorcycle();
  }
  
}
