package com.example.abstractExample.factories;

import com.example.abstractExample.aircrafts.IAirCraft;
import com.example.abstractExample.landVehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAirCraft createTransportAircraft();
}
