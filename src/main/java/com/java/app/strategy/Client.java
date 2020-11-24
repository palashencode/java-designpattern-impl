package com.java.app.strategy;

import java.util.HashMap;
import java.util.Map;

public class Client {
    Context context;
    Map data;

    public void configure(Strategy strategy, Map data){
        context = new Context();
        this.data = data;
        context.setStrategy(strategy);

    }

    public void executeClientCode(){

        // Executing of code
        context.executeStrategy(data);
    }

}
