package com.java.app.flyweight;

import com.java.app.DesignPattern;

public class FlyweightPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("FLYWEIGHT PATTERN");
        System.out.println("=================");

        Client client = new Client();
        client.executeCode();

    }
    
}
