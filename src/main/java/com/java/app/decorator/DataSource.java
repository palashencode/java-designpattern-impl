package com.java.app.decorator;

interface DataSource {
    void writeData(String s);
    String readData();
  }