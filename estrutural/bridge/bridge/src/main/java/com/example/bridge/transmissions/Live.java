package com.example.bridge.transmissions;

import com.example.bridge.platforms.IPlatform;

public class Live implements ITransmission {

  protected IPlatform platform;

  public Live(){

  }

  public Live(IPlatform platform){
    this.platform = platform;
  }


  @Override
  public void broadcasting() {
    System.out.println("Iniciando a transmissão ao vivo");
  }

  @Override
  public void result() {
    System.out.println("No ar");
  }
  
}
