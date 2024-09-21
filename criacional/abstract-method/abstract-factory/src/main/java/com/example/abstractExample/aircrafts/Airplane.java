package com.example.abstractExample.aircrafts;

public class Airplane implements IAirCraft {

  @Override
  public void startRoute() {
    wind();
    getCargo();
    System.out.println("Iniciando decolagem");
  }

  @Override
  public void getCargo() {
   System.out.println("Passageiros a bordo do avião, vôo autorizado");
  }

  @Override
  public void wind() {
    System.out.println("Ventos a 25km, ventos OK");
  }
}
