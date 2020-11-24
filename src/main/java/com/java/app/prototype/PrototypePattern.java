package com.java.app.prototype;

import java.beans.DesignMode;

import com.java.app.DesignPattern;

public class PrototypePattern implements DesignPattern{

    @Override
    public void run() {
        Client client = new Client();
        System.out.println("Prototype Pattern");
        System.out.println("=================");

        client.executeClientCode();
    }
    
}
