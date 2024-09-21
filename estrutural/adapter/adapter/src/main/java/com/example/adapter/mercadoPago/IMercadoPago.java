package com.example.adapter.mercadoPago;

import com.example.adapter.utils.Token;

public interface IMercadoPago {
  Token authToken();
  void sendMercadoPago();
  void receiveMercadoPago();
}
