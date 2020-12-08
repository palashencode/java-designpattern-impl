package com.java.app.proxy;

import com.java.app.DesignPattern;

public class ProxyPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("PROXY PATTERN");
        System.out.println("=============");

        Client client = new Client();
        client.executeClientCode();
    }
    
}
