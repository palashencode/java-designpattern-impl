package com.java.app.abstract_factory.factories;

public abstract class CheckBox {
    public String valueText;
    public boolean value;

    public CheckBox(String valueText, boolean value){
        this.valueText = valueText;
        this.value = value;
    }

    public abstract void render();
}
