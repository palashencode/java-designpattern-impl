package com.java.app.mediator;

import com.java.app.DesignPattern;

public class MediatorPattern implements DesignPattern{

    @Override
    public void run() {
        Client client = new Client();
        client.executeCode();
    }
    
}
