package com.java.app.memento;

import com.java.app.DesignPattern;

public class MementoPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("MEMENTO");
        System.out.println("=======");

        Client client = new Client();
        client.executeCode();
    }
    
}
