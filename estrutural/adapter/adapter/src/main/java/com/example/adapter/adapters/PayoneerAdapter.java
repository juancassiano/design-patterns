package com.example.adapter.adapters;

import com.example.adapter.payoneer.Payoneer;
import com.example.adapter.paypal.IPaypalPayments;
import com.example.adapter.utils.Token;

public class PayoneerAdapter implements IPaypalPayments {
  private Token token;
  private Payoneer payoneer;

  public PayoneerAdapter(Payoneer payoneer) {
    this.payoneer = payoneer;
    System.out.println("Adaptando Payoneer utilizando os métodos da interface IPaypalPayments");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    this.payoneer.sendPayment();
  }

  @Override
  public void paypalReceive() {
    this.payoneer.receivePayment();
  }

}
