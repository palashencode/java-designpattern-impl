package com.java.app.strategy;

import java.util.Map;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(Map data){
        this.strategy.execute(data);
    }
}
