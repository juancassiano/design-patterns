package com.example.abstractExample.landVehicles;

public class Car implements ILandVehicle {

  @Override
  public void startRoute() {
   getCargo();
  } 
  
  @Override
  public void getCargo() {
   System.out.println("Pegamos os passageiros de carro, estamos prontos.");
  }
  
}
