package com.customs;
import com.customs.AdapterAutoToVehicle;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

import java.util.Objects;

public class AdapterCustoms implements Customs {
    private final VehicleCalculator carCalculator;
    private final VehicleCalculator truckCalculator;

    public AdapterCustoms(VehicleCalculator carCalculator, VehicleCalculator truckCalculator) {
        this.carCalculator = carCalculator;
        this.truckCalculator = truckCalculator;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        String price;
        Vehicle vehicle = new AdapterAutoToVehicle(auto);
        if (Objects.equals(auto.model, "truck")) {
            truckCalculator.setVehicle(vehicle);
            price = truckCalculator.calculatePrice();
            return convertUSDtoUAH((Float.parseFloat(price.substring(0, price.length()-3))));
        }
        else {
            carCalculator.setVehicle(vehicle);
            price = carCalculator.calculatePrice();
            return convertUSDtoUAH(Float.parseFloat(price.substring(0, price.length()-3)));
        }
    }

    @Override
    public float tax(Auto auto) {
        return (float) (vehiclePrice(auto)*0.1);
    }

    public static float convertUSDtoUAH(float sumInUSD) {
        return (float) (sumInUSD*39.31);
    }
}
