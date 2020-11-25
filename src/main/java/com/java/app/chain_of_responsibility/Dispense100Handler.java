package com.java.app.chain_of_responsibility;

public class Dispense100Handler extends Handler {

    Dispense100Handler(){
        super("Dispense100Handler");
    }

    @Override
    public Handler setNextHandler(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void process(Currency data) {
        if(data.getAmount() >= 100){
            int notes = data.getAmount()/100;
            int remaining = data.getAmount()%100;
            data.setAmount(remaining);
            
            System.out.println("100 Notes:"+notes);

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

