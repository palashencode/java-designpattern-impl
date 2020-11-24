package com.java.app.singleton;

// Simple eager initialization eliminates most of the synchronization issues
// JCIP - pg 213
// Synchronization is not required as Java Static variable initialization is guaranteed by JVM
public class SimpleEagerInitialization {
    // This initialization happens across all JVMs
    private static Resource resource = new Resource(); 

    public static Resource getInstance(){ return resource; }

    private static class Resource implements IResource{}
}
