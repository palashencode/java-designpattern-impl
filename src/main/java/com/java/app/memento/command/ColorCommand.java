package com.java.app.memento.command;

import com.java.app.memento.Editor;
import java.awt.*;
import com.java.app.memento.shape.Shape;

public class ColorCommand implements Command{
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
