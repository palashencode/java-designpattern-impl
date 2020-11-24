package com.java.app.singleton;

// JCIP - pg 213
// Using Java's Class Loader Mechanic to lazy load the Singleton 
// https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples#thread-safe-singleton
// Also called BillPugh Singleton
public class LazyInitializationHolder {
    private static class ResourceHolder{
        private static final Resource resource = new Resource();
    }

    private static class Resource implements IResource{}

    // Using java's lazy class loading
    // `ResourceHolder` gets loaded only on first call.
    // JVM ensures static initialization happens.
    public static Resource getInstance(){
        return ResourceHolder.resource;
    }
}
