package com.example.adapter.adapters;

import com.example.adapter.mercadoPago.MercadoPago;
import com.example.adapter.paypal.IPaypalPayments;
import com.example.adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {

  private Token token;
  private MercadoPago mercadoPago;

  public MercadoPagoAdapter(MercadoPago mercadoPago){
    this.mercadoPago = mercadoPago;
    System.out.println("Adaptando MercadoPago utilizando os métodos da interface IPaypalPayments");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    this.mercadoPago.sendMercadoPago();
  }

  @Override
  public void paypalReceive() {
    this.mercadoPago.receiveMercadoPago();
  }
  
}
