package com.java.app.decorator;

public class MD5Decorator extends DataSourceBaseDecorator{

    MD5Decorator(DataSource ds){
      super(ds);
    }
  
   public void writeData(String s){
      System.out.println("-md5code");
      super.writeData(s+":md5");
    }
  
   public String readData(){
      String s = super.readData();
      System.out.println("-md5decode");
      return s;
    }
  
  }
