package com.example.abstractExample.landVehicles;

public class Motorcycle implements ILandVehicle {

  @Override
  public void startRoute() {
   getCargo();
  } 
  
  @Override
  public void getCargo() {
   System.out.println("Pegamos sua encomenda de moto, estamos prontos.");
  }
  
}
