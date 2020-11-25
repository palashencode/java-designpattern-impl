package com.java.app.command;

import com.java.app.DesignPattern;

public class CommandPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("Command Pattern:");
        System.out.println("================");

        Client client = new Client();
        client.executeClientCode();

    }
    
}
