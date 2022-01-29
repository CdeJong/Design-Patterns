package com.cdejong.patterns.decorator.decorators;

import com.cdejong.patterns.decorator.Vehicle;

public abstract class VehicleDecorator implements Vehicle {

    protected Vehicle vehicle;

    public VehicleDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String getDescription() {
        return vehicle.getDescription();
    }

}
