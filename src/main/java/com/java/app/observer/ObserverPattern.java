package com.java.app.observer;

import com.java.app.DesignPattern;

public class ObserverPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("OBSERVER PATTERN");
        System.out.println("================");

        Client client = new Client();
        client.executeCode();

    }
    
}
