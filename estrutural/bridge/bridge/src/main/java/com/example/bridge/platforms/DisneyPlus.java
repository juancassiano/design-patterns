package com.example.bridge.platforms;

public class DisneyPlus implements IPlatform{

  public DisneyPlus(){
    configureRMTP();
    System.out.println("DisneyPlus: Iniciando transmissão");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("DisneyPlus: Configurando servidor RMTP");
  }

  @Override
  public void authToken() {
    System.out.println("DisneyPlus: Autorizando aplicação");
  }
  
}
