package com.java.app.observer;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor(){
        this.events = new EventManager("open","save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open", file);
    }
    
    public void saveFile() throws Exception{
        if(this.file == null){
            throw new Exception("Open a file first");
        }
        events.notify("save", file);
    }

}
