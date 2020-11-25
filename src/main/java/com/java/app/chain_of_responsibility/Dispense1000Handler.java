package com.java.app.chain_of_responsibility;

public class Dispense1000Handler extends Handler{
    Dispense1000Handler(){
        super("Dispense1000Handler");
    }

    @Override
    public Handler setNextHandler(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void process(Currency data) {
        if(data.getAmount() >= 1000){
            int notes = data.getAmount()/1000;
            int remaining = data.getAmount()%1000;
            data.setAmount(remaining);
            
            System.out.println("1000 Notes:"+notes);

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
