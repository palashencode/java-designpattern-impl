package com.java.app.builder;

import com.java.app.builder.parts.CarType;
import com.java.app.builder.parts.Engine;
import com.java.app.builder.parts.GPSNavigator;
import com.java.app.builder.parts.StatComputer;
import com.java.app.builder.parts.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setStatComputer(StatComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
