package com.java.app.singleton;

import java.beans.DesignMode;

import com.java.app.DesignPattern;

public class SingletonPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("Singleton Pattern");
        System.out.println("=================");

        Client client = new Client();
        client.executeClientCode();

    }
    
}
