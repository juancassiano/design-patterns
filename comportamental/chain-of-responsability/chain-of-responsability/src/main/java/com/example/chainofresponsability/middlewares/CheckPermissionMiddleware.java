package com.example.chainofresponsability.middlewares;

public class CheckPermissionMiddleware extends Middleware {
  @Override
  public boolean check(String email, String password) {
    if(email.equals("master@mail.com")) {
      System.out.println("Hello, Master!");
      return true;
    }
    System.out.println("Hello, User!");
    return checkNext(email, password);
  }
  
}
