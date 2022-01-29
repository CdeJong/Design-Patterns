package com.cdejong.patterns.decorator.decorators;

import com.cdejong.patterns.decorator.Vehicle;

public class SmallVehicleDecorator extends VehicleDecorator {

    private final static String SIZE = "Small";

    public SmallVehicleDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return SIZE + " " + super.getDescription();
    }
}
