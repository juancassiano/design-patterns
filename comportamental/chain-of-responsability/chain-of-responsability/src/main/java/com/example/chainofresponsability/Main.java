package com.example.chainofresponsability;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.chainofresponsability.middlewares.CheckPermissionMiddleware;
import com.example.chainofresponsability.middlewares.CheckUserMiddleware;
import com.example.chainofresponsability.middlewares.Middleware;
import com.example.chainofresponsability.server.Server;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.register("master@mail.com","123456");        
        server.register("user@mail.com","123");  
        
        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do{
            System.out.println("Digite seu email:");
            String email = reader.readLine();
            System.out.println("Digite sua senha:");
            String password = reader.readLine();

            done = server.login(email, password);
        }while(!done);
    }
}