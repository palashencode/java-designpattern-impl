
# Mediator

**Goal:**
---

- Create an Intermediary Controller.
- The principle is to cease all direct communication between the components, and cause decoupling between components, via a Mediator class.
- We can sub-class the parent mediator to create new kinds of relationships.

**JDK Use:**
---

- `java.util.Timer`
- `java.util.concurrent.Executor#execute()`
- `java.util.concurrent.ExecutorService#submit()`
- `java.util.concurrent.ScheduledExecutorService`
- `java.lang.reflect.Method#invoke()`

**Pros:**
---

- Single Responsibility Principle - we extract the relationship between components, into a separate class.
- Open/Closed Principle - we can create new Mediators and Relationships without having to change the actual components.

**Cons:**
---

- Putting too much logic into the Mediator can cause it to become bloated and cause the *God Object Anti Pattern*.

**References:**
---

- https://refactoring.guru/design-patterns/mediator