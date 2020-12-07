package com.java.app.memento;

import java.util.ArrayList;
import java.util.List;

import com.java.app.memento.command.Command;

public class History {
    private List<Pair> history = new ArrayList<>();
    
    // Because the history buffer might do, undo and redo
    // so a new pointer is needed.
    private int virtualSize = 0;

    private class Pair {
        Command command;
        Memento memento;
        
        Pair(Command c, Memento m){
            command = c;
            memento = m;
        }

        private Command getCommand(){
            return this.command;
        }

        private Memento getMemento(){
            return this.memento;
        }
    }

    public void push(Command c, Memento m){
        if(virtualSize != history.size() && virtualSize > 0){
            // Restructuring the undo stack to reflect the actual pointer
            history = history.subList(0, virtualSize - 1);
        }

        history.add(new Pair(c,m));
        virtualSize = history.size();
    }

    public boolean redo(){
        Pair pair = getRedo();
        if(pair == null){
            return false;
        }
        
        System.out.println("Redoing: " + pair.getCommand().getName());
        pair.getMemento().restore();
        pair.getCommand().execute();
        return true;
    }

    private Pair getRedo(){
        if(virtualSize == history.size()){
            return null;
        }

        virtualSize = Math.min(history.size(), virtualSize + 1);
        return history.get(virtualSize - 1);
    }

    public boolean undo(){
        Pair pair = getUndo();
       
        if(pair == null){
           return false; 
        }

        System.out.println("Undoing: " + pair.getCommand().getName());
        pair.getMemento().restore();
        return true;
    }

    private Pair getUndo(){
        if(virtualSize == 0){
            return null;
        }

        virtualSize = Math.max(0, virtualSize - 1);
        return history.get(virtualSize);
    }
}
