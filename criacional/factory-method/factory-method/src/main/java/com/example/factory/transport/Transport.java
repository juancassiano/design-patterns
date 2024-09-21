package com.example.factory.transport;

import com.example.factory.vehicle.IVehicle;

public abstract class Transport {
  public void startTransport(){
    IVehicle vehicle = createTransport();
    vehicle.startRoute();
  };

  protected abstract IVehicle createTransport();
}
