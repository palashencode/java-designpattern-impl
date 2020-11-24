package com.java.app.abstract_factory.mac;

import com.java.app.abstract_factory.factories.Button;

public class MACButton extends Button{
    MACButton(String displayText) {
        super(displayText);
    }

    @Override
    public void render() {
        System.out.println("Painting MAC Button");
    }
}
