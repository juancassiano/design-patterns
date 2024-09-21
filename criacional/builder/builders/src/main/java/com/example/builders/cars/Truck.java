package com.example.builders.cars;

import com.example.builders.components.CarType;
import com.example.builders.components.Engine;
import com.example.builders.components.Transmission;

public class Truck {
  private final CarType carType;
  private final Integer seats;
  private final Engine engine;
  private final Transmission transmission;
  private final String color;

  public Truck(CarType carType, Integer seats, Engine engine, Transmission transmission, String color){
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    this.color = color;
  }

  public String result(){
    String truck = "Truck with motor: " + engine.getPower() + "\n";
    truck += "Transmission: " + transmission + "\n";

    return truck;
  }
}
