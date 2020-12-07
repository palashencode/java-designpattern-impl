package com.java.app.composite;

import java.beans.DesignMode;

import com.java.app.DesignPattern;

public class CompositePattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("COMPOSITE PATTERN");
        System.out.println("=================");

        Client client = new Client();
        client.executeClientCode();
    }
    
}
