package com.example.abstractExample.aircrafts;

public class Helicopter implements IAirCraft {

  @Override
  public void startRoute() {
    wind();
    getCargo();
    System.out.println("Iniciando decolagem");
  }

  @Override
  public void getCargo() {
   System.out.println("Passageiros a bordo do helicóptero, vôo autorizado");
  }

  @Override
  public void wind() {
    System.out.println("Ventos a 30km, ventos OK");
  }
}
