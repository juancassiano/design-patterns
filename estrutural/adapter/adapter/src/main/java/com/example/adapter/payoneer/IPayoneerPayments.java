package com.example.adapter.payoneer;

import com.example.adapter.utils.Token;

public interface IPayoneerPayments {
  Token authToken();
  void sendPayment();
  void receivePayment();
  
}
