package com.java.app.mediator.component;

import com.java.app.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}