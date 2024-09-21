package com.example.builders.builders;

import com.example.builders.components.CarType;
import com.example.builders.components.Engine;
import com.example.builders.components.Transmission;

public interface IBuilder {
  void setCarType(CarType carType);
  void setSeats(Integer seats);
  void setTransmission(Transmission transmission);
  void setEngine(Engine engine);
  void setColor(String color);
}
