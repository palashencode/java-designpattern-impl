package com.java.app.factory;

public class WindowButton implements Button{

    @Override
    public void onClick() {
        System.out.println("WindowButton clicked");
    }

    @Override
    public void render() {
        System.out.println("JPanel, WindowButton, rendered.");
    }
    
}
