package com.cdejong.patterns.decorator;

import com.cdejong.patterns.decorator.decorators.BigVehicleDecorator;
import com.cdejong.patterns.decorator.decorators.BlueColorVehicleDecorator;
import com.cdejong.patterns.decorator.decorators.RedColorVehicleDecorator;
import com.cdejong.patterns.decorator.decorators.SmallVehicleDecorator;

public class DecoratorPattern {

    public static void main(String[] args) {

        // create the undecorated vehicles car and bike
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // print the description of the undecorated vehicles
        System.out.println(car.getDescription());
        System.out.println(bike.getDescription());

        // decorate car
        Vehicle redCar = new RedColorVehicleDecorator(car);
        Vehicle bigRedCar = new BigVehicleDecorator(redCar);

        // print decorated car
        System.out.println(bigRedCar.getDescription());

        // decorate bike
        Vehicle smallBike = new SmallVehicleDecorator(bike);
        Vehicle blueSmallBike = new BlueColorVehicleDecorator(smallBike);

        // print decorated bike
        System.out.println(blueSmallBike.getDescription());


    }
}
