package com.cdejong.patterns.decorator.decorators;

import com.cdejong.patterns.decorator.Vehicle;

public class RedColorVehicleDecorator extends VehicleDecorator {

    private final static String COLOR = "Red";

    public RedColorVehicleDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return COLOR + " " + super.getDescription();
    }
}
