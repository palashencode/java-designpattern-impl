

ref - https://refactoring.guru/design-patterns/chain-of-responsibility

Goal : It lets you pass requests along a chain of handlers and lets you create chains at runtime.

**When to use:**
- Used when your program is expected to process different kinds of requests in different ways but the exact sequence is not known before hand
- helps you execute handling functions in different order ( used in request filtering in web-servers )
- any request that needs to be resolved in chains

**OOP Principles follows :**
- Single Responsibility Principle
- Open/Closed Principle. ( open for extension/closed for modification)

**JDK Use:**
- `javax.servlet.filter.doFilter()`
- `javax.util.logging.Logger.log()`

**Points about this Implementation**
- It takes inspiration from the Journal Dev example and creates a chain of Cash Dispensers
- I was not happy with how objects were chained, 
    - they looks clunky. 
    - I wanted the ability to smmothly chain objects. 
    - hence i updated the signature of set handler to `public abstract Handler setNextHandler(Handler handler);`
- Also I wanted visibility on my completed chain
    - hence added the `public void printChain()` method.
    - I did not like how it was getting repeated in all subclasses
    - hence i converted the `Handler` to an abstract class and moved the implementation inside it, enriching all clind handlers.
    - it allows me to easily print a chain at any point.

**Points of Improvements**
- I am still not happy with the fact that the handlers cannot return any values, I could not find an elegant solution to that, so I have left it for now.

**References -**
- https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java
- https://refactoring.guru/design-patterns/chain-of-responsibility/java/example
