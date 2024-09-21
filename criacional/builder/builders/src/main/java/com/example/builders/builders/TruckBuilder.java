package com.example.builders.builders;

import com.example.builders.cars.Truck;
import com.example.builders.components.CarType;
import com.example.builders.components.Engine;
import com.example.builders.components.Transmission;

public class TruckBuilder implements IBuilder{

  private CarType carType;
  private Integer seats;
  private Engine engine;
  private Transmission transmission;
  private String color;

  @Override
  public void setCarType(CarType carType) {
   this.carType = carType;
  }

  @Override
  public void setSeats(Integer seats) {
    this.seats = seats;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  public Truck getResult(){
    return new Truck(carType, seats, engine, transmission, color);
  }

  
}
