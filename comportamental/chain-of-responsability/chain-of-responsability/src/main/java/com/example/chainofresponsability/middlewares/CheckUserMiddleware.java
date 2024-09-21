package com.example.chainofresponsability.middlewares;

import com.example.chainofresponsability.server.Server;

public class CheckUserMiddleware extends Middleware{
  private Server server;

  public CheckUserMiddleware(Server server) {
    this.server = server;
  }

  @Override
  public boolean check(String email, String password) {
    if(!server.hasEmail(email)) {
      System.out.println("This email is not registered!");
      return false;
    }

    if(!server.isValidPassword(email, password)) {
      System.out.println("Wrong e-mail/password!");
      return false;
    }

    return checkNext(email, password);

  }
  
}
