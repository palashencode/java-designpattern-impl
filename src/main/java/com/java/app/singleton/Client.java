package com.java.app.singleton;

public class Client {
    public void executeClientCode(){
        // Standard Thread Safe Double Checked Implementation
        IResource singleton = ThreadSafeDoubleLockedSingleton.getInstance();
        System.out.println("ThreadSafeDoubleLockedSingleton.getInstance();");

        // Eager Initialization without synchronization
        // using JVM's class loading.
        IResource singleton2 = SimpleEagerInitialization.getInstance();
        System.out.println("SimpleEagerInitialization.getInstance();");

        // Lazy Initialization without synchronization using 
        // a loading of a holder class.
        IResource singleton3 = LazyInitializationHolder.getInstance();
        System.out.println("LazyInitializationHolder.getInstance();");
    
    }
}
