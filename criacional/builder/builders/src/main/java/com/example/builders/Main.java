package com.example.builders;

import com.example.builders.builders.CarBuilder;
import com.example.builders.builders.SportCarBuilder;
import com.example.builders.builders.TruckBuilder;
import com.example.builders.cars.Car;
import com.example.builders.cars.Sport;
import com.example.builders.cars.Truck;
import com.example.builders.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType());

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result());

        SportCarBuilder sportiveCarBuilder = new SportCarBuilder();
        director.constructSportiveCar(sportiveCarBuilder);
        Sport carSport = sportiveCarBuilder.getResult();
        System.out.println(carSport.getCarType());
    }
}