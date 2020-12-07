package com.java.app.visitor.shapes;

import com.java.app.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}