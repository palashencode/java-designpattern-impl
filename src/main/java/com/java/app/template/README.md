
# Template Pattern

**Goal:**
---

- it lets us define the skeleton of the algorithm in a superclass, but lets the subclass override specific parts of the algo, without changing its overall structure.

**Pros:**
---

- Allow clients override specific parts of the algo, while keeping the over all structure same.

**JDK Use:**
---

- `javax.servlet.http.HttpServlet#doXXX()`
- `java.util.AbstractList` - non-abstract methods of the AbstractList
-  `java.io.InputStream` - it's non-abstract methods.

**Reference:**
---

- https://refactoring.guru/design-patterns/template-method
