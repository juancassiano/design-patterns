package com.example.factory.vehicle;

public class Car implements IVehicle{

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando Trajeto de Carro.");
  }

  @Override
  public void getCargo() {
    System.out.println("Passageiros a bordo. Estamos prontos.");
  }
  
}
