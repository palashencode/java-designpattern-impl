package com.java.app.abstract_factory.win;

import com.java.app.abstract_factory.factories.Button;

public class WINButton extends Button{
    WINButton(String displayText) {
        super(displayText);
    }

    @Override
    public void render() {
        System.out.println("Painting WIN Button");
    }
}
