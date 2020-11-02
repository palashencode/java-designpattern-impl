package com.java.app.decorator;

public class FileDataSource implements DataSource{

    private String data;
  
    public void writeData(String s){
      this.data = s;
    }
  
    public String readData(){
      return this.data;
    }
  
  }
