package com.java.app.visitor;

import com.java.app.visitor.shapes.Circle;
import com.java.app.visitor.shapes.CompoundShape;
import com.java.app.visitor.shapes.Dot;
import com.java.app.visitor.shapes.Rectangle;
import com.java.app.visitor.shapes.Shape;

public class Client {
    public void executeClientCode(){
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        this.export(circle, compoundShape);
    }

    private void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
