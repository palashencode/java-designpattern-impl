package com.java.app.singleton;

// DCL Thread Safe Implementation, with inner resource
public final class ThreadSafeDoubleLockedSingleton {
    
    // Using Inner Class Resource
    private static class Resource implements IResource{
    }

    private static volatile Resource singleton;
    
    public static Resource getInstance(){
        if(singleton == null){
            synchronized(ThreadSafeDoubleLockedSingleton.class){
                if(singleton == null){
                    singleton = new Resource();
                }
            }
        }
        return singleton;
    }
}

