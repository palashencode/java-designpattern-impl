package com.java.app.decorator;

public class EncryptDecorator extends DataSourceBaseDecorator{

    EncryptDecorator(DataSource ds){
      super(ds);
    }
  
   public void writeData(String s){
     System.out.println("-encrypt");
      super.writeData(s+":ENCRYPT");
    }
  
   public String readData(){
      String s = super.readData();
      System.out.println("-deencrypt");
      return s;
    }
  
  }