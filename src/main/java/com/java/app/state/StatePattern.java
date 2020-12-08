package com.java.app.state;

import com.java.app.DesignPattern;

public class StatePattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("STATE PATTERN");
        System.out.println("=============");
        Client client = new Client();
        client.executeClientCode();
    }
    
}
