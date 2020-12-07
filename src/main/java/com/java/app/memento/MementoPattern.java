package com.java.app.memento;

import com.java.app.DesignPattern;

public class MementoPattern implements DesignPattern{

    @Override
    public void run() {
        Client client = new Client();
        client.executeCode();
    }
    
}
