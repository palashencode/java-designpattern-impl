package com.java.app.facade;

import java.beans.DesignMode;

import com.java.app.DesignPattern;

public class FacadePattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("FACADE PATTERN");
        System.out.println("==============");

        Client client = new Client();
        client.executeClientCode();

    }
    
}
