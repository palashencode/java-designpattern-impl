package com.java.app.chain_of_responsibility;

public class Dispense10Handler extends Handler{
   
    Dispense10Handler(){
        super("Dispense10Handler");
    }

    @Override
    public Handler setNextHandler(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void process(Currency data) {
        if(data.getAmount() >= 10){
            int notes = data.getAmount()/10;
            int remaining = data.getAmount()%10;
            data.setAmount(remaining);
            
            System.out.println("10 Notes:"+notes);

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
