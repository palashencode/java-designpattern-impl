package com.java.app.decorator;

public class CompressDecorator extends DataSourceBaseDecorator{

    CompressDecorator(DataSource ds){
      super(ds);
    }
  
   public void writeData(String s){
      System.out.println("-compress");
      super.writeData(s+":COMPRESS");
    }
  
   public String readData(){
      String s = super.readData();
      System.out.println("-decompress");
      return s;
    }
  
  }