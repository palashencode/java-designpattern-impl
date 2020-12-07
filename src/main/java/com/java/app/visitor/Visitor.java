package com.java.app.visitor;

import com.java.app.visitor.shapes.Circle;
import com.java.app.visitor.shapes.CompoundShape;
import com.java.app.visitor.shapes.Dot;
import com.java.app.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}