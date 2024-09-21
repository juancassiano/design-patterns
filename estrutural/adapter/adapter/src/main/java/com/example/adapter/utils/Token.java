package com.example.adapter.utils;

public class Token {
  private String token;

  public Token(){
    this.token = "https://jwt.io/#debugger-io?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiRGVzaWduIFBhdHRlcm5zIiwiaWF0IjoxNTE2MjM5MDIyfQ.7y5QJ2Rx00K206AhrKOq_u3aielSDbFAj4-LRhnGU3E";
  }

  public String getToken(){
    return this.token;
  }
}
