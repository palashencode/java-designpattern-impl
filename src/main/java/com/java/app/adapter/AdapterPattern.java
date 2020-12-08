package com.java.app.adapter;

import com.java.app.DesignPattern;

public class AdapterPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("ADAPTER PATTERN");
        System.out.println("===============");

        Client client = new Client();
        client.executeClientCode();

    }
    
}
