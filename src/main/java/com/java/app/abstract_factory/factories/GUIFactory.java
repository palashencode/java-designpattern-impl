package com.java.app.abstract_factory.factories;

public abstract class GUIFactory {
    public abstract Button createButton(String displayText);
    public abstract CheckBox createCheckBox(String valueText, boolean value);
}
