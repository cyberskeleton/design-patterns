package com.customs;
import com.vehiclecalculator.Vehicle;

public class AdapterAutoToVehicle extends Vehicle {
    public AdapterAutoToVehicle(Auto auto) {
        super(auto.age, auto.model, auto.damage? 0.5f:0, auto.mileage);
    }
}
