

REF - https://refactoring.guru/design-patterns/strategy

The advantage is that when we change the strategy, <br>the client code is not affected.

usually used in sorting in comparator.


1. Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.

2. Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.

3. Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.

4. Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm.