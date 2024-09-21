package com.example.factory;

import com.example.factory.transport.BikeTransport;
import com.example.factory.transport.CarTransport;
import com.example.factory.transport.MotorcycleTransport;
import com.example.factory.transport.Transport;

public class Main {
    private static Transport transport;
    public static void main(String[] args) {
        configure("eats");
        if (transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BikeTransport();
            default:
                System.out.println("Selecione um tipo de transporte.");
                break;
        }
    }
}