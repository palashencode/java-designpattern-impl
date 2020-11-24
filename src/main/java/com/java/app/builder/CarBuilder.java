package com.java.app.builder;

import com.java.app.builder.parts.CarType;
import com.java.app.builder.parts.Engine;
import com.java.app.builder.parts.GPSNavigator;
import com.java.app.builder.parts.StatComputer;
import com.java.app.builder.parts.Transmission;
import com.java.app.builder.products.Car;

public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private StatComputer statComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;

    }

    @Override
    public void setSeats(int seats) {
       this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
       this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
       this.transmission = transmission;
    }

    @Override
    public void setStatComputer(StatComputer statComputer) {
        this.statComputer = statComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car build(){
        return new Car(type, seats, engine, transmission, statComputer, gpsNavigator);
    }
    
}
