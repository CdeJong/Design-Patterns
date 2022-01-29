package com.cdejong.patterns.decorator.decorators;

import com.cdejong.patterns.decorator.Vehicle;

public class BlueColorVehicleDecorator extends VehicleDecorator {

    private final static String COLOR = "Blue";

    public BlueColorVehicleDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return COLOR + " " + super.getDescription();
    }
}
