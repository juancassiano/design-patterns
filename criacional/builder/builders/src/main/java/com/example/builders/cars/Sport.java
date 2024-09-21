package com.example.builders.cars;

import com.example.builders.components.CarType;
import com.example.builders.components.Engine;
import com.example.builders.components.Transmission;

public class Sport {
  private final CarType carType;
  private final Integer seats;
  private final Engine engine;
  private final Transmission transmission;
  private final String color;

  public Sport(CarType carType, Integer seats, Engine engine, Transmission transmission, String color){
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    this.color = color;
  }

  public CarType getCarType() {
    return carType;
  }

  public Integer getSeats() {
    return seats;
  }

  public Engine getEngine() {
    return engine;
  }

  public Transmission getTransmission() {
    return transmission;
  }

  public String getColor() {
    return color;
  }


}
