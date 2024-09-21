package com.example.builders.director;

import com.example.builders.builders.IBuilder;
import com.example.builders.components.CarType;
import com.example.builders.components.Engine;
import com.example.builders.components.Transmission;

public class Director {
  public void constructSedanCar(IBuilder builder){
    builder.setCarType(CarType.SEDAN);
    builder.setSeats(5);
    builder.setEngine(new Engine(1500));
    builder.setColor("Black");
    builder.setTransmission(Transmission.AUTOMATIC);
  }

  public void constructTruck(IBuilder builder){
    builder.setCarType(CarType.TRUCK);
    builder.setSeats(5);
    builder.setColor("Green");
    builder.setEngine(new Engine(15000));
    builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
  }

  public void constructSportiveCar(IBuilder builder){
    builder.setCarType(CarType.SPORTCAR);
    builder.setColor("Amarelo");
    builder.setSeats(2);
    builder.setEngine(new Engine(3000));
    builder.setTransmission(Transmission.MANUAL);
  }
}
