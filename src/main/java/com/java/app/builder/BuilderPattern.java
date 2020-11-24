package com.java.app.builder;

import com.java.app.DesignPattern;

public class BuilderPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("BuilderPattern:");
        System.out.println("===============");
        Client client = new Client();
        client.executeClientCode();
    }
    
}
