package com.java.app.builder;

import com.java.app.builder.products.Auto;
import com.java.app.builder.products.Car;

public class Client {
    
    public void executeClientCode(){
        // Holds the building reciepies
        Director director = new Director();

        // A builder of type Car
        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);

        Car cityCar = carBuilder.build();
        System.out.println("Car built:-"+cityCar.getCarType());
        
        System.out.println("---------------");

        AutoBuilder autoBuilder = new AutoBuilder();

        director.constructAuto(autoBuilder);
        Auto auto = autoBuilder.build();
        System.out.println("Auto built:- "+auto.print());
    }
}
