package com.example.bridge.platforms;

public class Youtube implements IPlatform {

  public Youtube(){
    configureRMTP();
    System.out.println("Youtube: Iniciando transmissão");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Youtube: Configurando servidor RMTP");
  }

  @Override
  public void authToken() {
    System.out.println("Youtube: Autorizando aplicação");
  }
  
}
