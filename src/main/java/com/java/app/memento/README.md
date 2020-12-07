

**Goal**
---
It lets you save and restore states of an object without revealing the internal details of implementation.

**How is it implemented:**
---
- Usually in languages with nested classes it is implemented with `memento` as a nested inner class of the `originator`
- In other cases, it uses an intermediate interface, between the originator and caretaker classes.
- A stricter version of the previous case which has Originators and Mementos as interfaces interacting with each other.

- This example uses `Serialization` to implement the backup and restore functionality.

**References**
---
- https://refactoring.guru/design-patterns/memento
- https://refactoring.guru/design-patterns/memento/java/example