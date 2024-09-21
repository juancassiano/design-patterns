package com.example.adapter.mercadoPago;

import com.example.adapter.utils.Token;

public class MercadoPago implements IMercadoPago{
  private Token token;

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void sendMercadoPago() {
    this.token = authToken();
    System.out.println("Enviando pagamentos via MercadoPago");
  }

  @Override
  public void receiveMercadoPago() {
    System.out.println("Recebendo pagamentos via MercadoPago");
  }
  
}
