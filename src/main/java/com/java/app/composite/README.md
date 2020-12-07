
# Composite Pattern


**Goal:**
---

It lets you compose objects into complicated structures and yet, work with those structures as if they are individual objects.

**JDK Use:**
---

- `java.awt.Container` - in Swings
- `javax.faces.component.UIComponent` - JSF UI Components

**Pros:**
---

- work with complex structures as if they are individual objects.
- introduce new objects, without breaking existing structures.

**Cons**
---

- all objects must have a common behaviour
- difficult to implement for hierarchies where objects differ a lot by functionality

**References:**
---

- https://refactoring.guru/design-patterns/composite