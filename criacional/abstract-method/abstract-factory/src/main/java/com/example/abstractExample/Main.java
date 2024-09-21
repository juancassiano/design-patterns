package com.example.abstractExample;

import com.example.abstractExample.app.Application;
import com.example.abstractExample.app.TypeCompany;
import com.example.abstractExample.factories.ITransportFactory;
import com.example.abstractExample.factories.NineNineTransport;
import com.example.abstractExample.factories.UberTransport;

public class Main {
    public static Application configureApplication(TypeCompany typeCompany) {
        ITransportFactory transportFactory;

        if(typeCompany == TypeCompany.UBER){
            transportFactory = new UberTransport();
        } else {
            transportFactory = new NineNineTransport();
        }
        return new Application(transportFactory);
    }

    public static void main(String[] args) {
        Application app = configureApplication(TypeCompany.UBER);
        app.startRoute();
    }
}