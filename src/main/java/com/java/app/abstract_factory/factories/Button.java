package com.java.app.abstract_factory.factories;

public abstract class Button {
    public String displayText;

    protected Button(String displayText){
        this.displayText = displayText;
    }

    public abstract void render();
}
