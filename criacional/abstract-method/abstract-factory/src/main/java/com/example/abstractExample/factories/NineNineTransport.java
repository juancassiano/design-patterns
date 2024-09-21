package com.example.abstractExample.factories;

import com.example.abstractExample.aircrafts.Helicopter;
import com.example.abstractExample.aircrafts.IAirCraft;
import com.example.abstractExample.landVehicles.ILandVehicle;
import com.example.abstractExample.landVehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAirCraft createTransportAircraft() {
        return new Helicopter();
    }
}
