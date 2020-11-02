package com.java.app.decorator;

public class DataSourceBaseDecorator implements DataSource{

    private DataSource ds;
  
    DataSourceBaseDecorator(DataSource ds){
      this.ds = ds;
    }
  
    public void writeData(String s){
      ds.writeData(s);
    }
  
    public String readData(){
      return ds.readData();
    }
  
  }