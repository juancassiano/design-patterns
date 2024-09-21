package com.example.abstractExample.app;

import com.example.abstractExample.aircrafts.IAirCraft;
import com.example.abstractExample.factories.ITransportFactory;
import com.example.abstractExample.landVehicles.ILandVehicle;

public class Application {
  private ILandVehicle vehicle;
  private IAirCraft aircraft;

  public Application(ITransportFactory factory) {
    vehicle = factory.createTransportVehicle();
    aircraft = factory.createTransportAircraft();
  }

  public void startRoute(){
    vehicle.startRoute();
    aircraft.startRoute();
  }
}
