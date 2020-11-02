package com.java.app.decorator;

public class Client{

    private DataSource ds;
    
    Client(DataSource ds){
      this.ds = ds;
    }
    
    public void executeClientCode(){
      String data = "CORE-DATA";
      this.ds.writeData(data);
      System.out.println(this.ds.readData());
  
    }
  
  }