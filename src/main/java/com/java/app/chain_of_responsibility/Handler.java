package com.java.app.chain_of_responsibility;

public abstract class Handler {

    Handler nextHandler;
    public abstract Handler setNextHandler(Handler handler);
    public abstract void process(Currency data);

    private String name;
    Handler(String name){
        this.name = name;
    }
    
    public void printChain() {
        System.out.print(this.name);
        if(this.nextHandler != null){
            System.out.print(" -> ");
            this.nextHandler.printChain();
        }else{
            System.out.print(".");
            System.out.println("");
        }
    }
}
