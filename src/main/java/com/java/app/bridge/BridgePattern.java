package com.java.app.bridge;

import com.java.app.DesignPattern;

public class BridgePattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("BRIDGE PATTERN");
        System.out.println("==============");

        Client client = new Client();
        client.executeClientCode();
    }
    
}
