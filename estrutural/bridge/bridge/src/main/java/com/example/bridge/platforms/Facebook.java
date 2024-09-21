package com.example.bridge.platforms;

public class Facebook implements IPlatform {

  public Facebook(){
    configureRMTP();
    System.out.println("Facebook: Transmissão iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Facebook: Configurando servidor RMTP");
  }

  @Override
  public void authToken() {
    System.out.println("Facebook: Autorizando aplicação");
  }
  
}
