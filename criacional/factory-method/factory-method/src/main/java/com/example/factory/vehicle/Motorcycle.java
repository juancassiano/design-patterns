package com.example.factory.vehicle;

public class Motorcycle implements IVehicle {

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando a entrega de Moto.");
  }

  @Override
  public void getCargo() {
    System.out.println("Pegamos o encomenda. Estamos prontos.");
  }
  
}
