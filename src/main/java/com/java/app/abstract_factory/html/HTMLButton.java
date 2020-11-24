package com.java.app.abstract_factory.html;

import com.java.app.abstract_factory.factories.Button;

public class HTMLButton extends Button{

    HTMLButton(String displayText) {
        super(displayText);
    }

    @Override
    public void render() {
        System.out.println("Painting HTML Button");
    }
}
