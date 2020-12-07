package com.java.app.memento;

import com.java.app.memento.shape.Circle;
import com.java.app.memento.shape.CompoundShape;
import com.java.app.memento.shape.Dot;
import com.java.app.memento.shape.Rectangle;
import java.awt.Color;


public class Client {
    

    public void executeCode(){
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
