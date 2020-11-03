package com.java.app.factory;

import com.java.app.DesignPattern;

public class FactoryPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("FACTORY PATTERN");
        System.out.println("===============");

        Client c = new Client();
        c.executeClientCode();
    }
    
}
