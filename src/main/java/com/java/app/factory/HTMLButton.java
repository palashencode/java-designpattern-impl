package com.java.app.factory;

public class HTMLButton implements Button{

    @Override
    public void onClick() {
        System.out.println("HTMLButton clicked!");
    }

    @Override
    public void render() {
        System.out.println("<button>Submit</button>");
    }
    
}
