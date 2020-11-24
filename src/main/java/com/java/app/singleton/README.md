

ref - https://refactoring.guru/design-patterns/singleton

Goal - To ensure that the class has only one instance while providing a global access point to this instance.

*example in jdk* - `java.lang.Runtime.getRuntime()`

**Singleton Techniques**
1. Double Checked Thread Safe Method
    - `IResource singleton = ThreadSafeDoubleLockedSingleton.getInstance();`
    - using `IResource` to be able to access the Resource, which is a private static class.
    - requires synchronization, complex.
    - Java Concurrency in Practice - PG - 213
2. Eager Initialization without synchronization
    - `IResource singleton2 = SimpleEagerInitialization.getInstance();`
    - using `IResource` to be able to access the Resource, which is a private static class.
    - does not require `synchronization`
    - uses JVM's static variable default synchronization. 
    - Java Concurrency in Practice - PG - 213
3. Eager Initialization without synchronization using a Holder Class
    - `IResource singleton3 = LazyInitializationHolder.getInstance();`
    - using `IResource` to be able to access the Resource, which is a private static class.
    - does not require `synchronization`
    - uses JVM's static variable default synchronization.
    - Java Concurrency in Practice - PG - 213



    <br>The third one is the most advanced and easiest to use<br>

    