package com.cdejong.patterns.decorator.decorators;

import com.cdejong.patterns.decorator.Vehicle;

public class BigVehicleDecorator extends VehicleDecorator {

    private final static String SIZE = "Big";

    public BigVehicleDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription() {
        return SIZE + " " + super.getDescription();
    }
}
