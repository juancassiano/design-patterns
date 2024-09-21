package com.example.abstractExample.factories;

import com.example.abstractExample.aircrafts.Airplane;
import com.example.abstractExample.aircrafts.IAirCraft;
import com.example.abstractExample.landVehicles.Car;
import com.example.abstractExample.landVehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCraft createTransportAircraft() {
        return new Airplane();
    }
    
}
