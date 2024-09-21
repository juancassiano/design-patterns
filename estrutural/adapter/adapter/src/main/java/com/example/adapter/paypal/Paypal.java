package com.example.adapter.paypal;

import com.example.adapter.utils.Token;

public class Paypal implements IPaypalPayments{
  private Token token;

  @Override
  public Token authToken() {
    return new Token();
    }

  @Override
  public void paypalPayment() {
    this.token = authToken();
    System.out.println("Enviando pagamentos via Paypal");
  }

  @Override
  public void paypalReceive() {
    System.out.println("Recebendo pagamentos via Paypal");
  }
  
}
