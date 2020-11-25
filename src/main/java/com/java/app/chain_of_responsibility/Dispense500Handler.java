package com.java.app.chain_of_responsibility;

public class Dispense500Handler extends Handler {

    Dispense500Handler(){
        super("Dispense500Handler");
    }

    @Override
    public Handler setNextHandler(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void process(Currency data) {
        if(data.getAmount() >= 500){
            int notes = data.getAmount()/500;
            int remaining = data.getAmount()%500;
            data.setAmount(remaining);
            
            System.out.println("500 Notes:"+notes);

            if(remaining != 0){
                if(nextHandler!= null){
                    nextHandler.process(data);
                }else{
                    System.out.println("could not dispense:"+remaining);
                }
            }

        }else{
            if(nextHandler!= null){
                nextHandler.process(data);
            }else{
                System.out.println("could not dispense:"+data.getAmount());
            }
        }
    }



}
