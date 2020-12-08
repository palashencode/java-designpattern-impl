
# FlyWeight

**Goal:**
---

- It lets you fit a lot more objects into memory by separating a common part of the objects which is save/maintained separately outside, i.e. shared by all those disparate objects.

**Pros:**
---

- Saving memory.

**Cons:**
---

- Complexity increases.

**JDK Usecase:**
---

- `java.lang.Integer#valueOf(int)`.

**Note:**
---

- It can be identfied by a creation method that returns existing cached objects, instead of new ones.

**References:**
---

- https://refactoring.guru/design-patterns/flyweight/java/example