package com.example.bridge.platforms;

public class TwitchTV implements IPlatform{

  public TwitchTV(){
    configureRMTP();
    System.out.println("TwitchTV: Iniciando transmissão");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("TwitchTV: Configurando servidor RMTP");
  }

  @Override
  public void authToken() {
    System.out.println("TwitchTV: Autorizando aplicação");
  }
  
}
