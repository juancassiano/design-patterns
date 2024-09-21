package com.example.adapter.paypal;

import com.example.adapter.utils.Token;

public interface IPaypalPayments {
  Token authToken();
  void paypalPayment();
  void paypalReceive();
}
