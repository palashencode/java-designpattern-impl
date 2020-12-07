package com.java.app.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> listeners = new HashMap<>();
    
    public EventManager(String ...operations){
        for(String operation: operations){
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List<EventListener> listenerList = listeners.get(eventType);
        if(listenerList != null){
            listenerList.add(listener);
        }
    }

    public void unSubscribe(String eventType, EventListener listener){
        List<EventListener> listenerList = listeners.get(eventType);
        if(listenerList != null){
            listenerList.remove(listener);
        }
    }

    public void notify(String eventType, File file){
        List<EventListener> listenerList = listeners.get(eventType);
        if(listenerList != null){
            for(EventListener listener : listenerList){
                listener.update(eventType, file);
            }
        }
    }
}
