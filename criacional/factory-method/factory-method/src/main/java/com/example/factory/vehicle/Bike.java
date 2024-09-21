package com.example.factory.vehicle;

public class Bike implements IVehicle {

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando a entrega de Bike.");

  }

  @Override
  public void getCargo() {
    System.out.println("Pegamos a sua comida. Estamos prontos.");
  }
  
}
