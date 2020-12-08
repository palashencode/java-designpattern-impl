
# Facade Pattern

**Goal:**
---

- to present a simplified interface, to a complex set of classes.


**Pros:**
---

- you can isolate your code from the complexity of the subsystem it is interacting with.

**JDK Use:**
---

- `javax.faces.context.FacesContext` uses `LifeCycle`, `ViewHandler` and `NavigationHandler`, under the hood, but most clients are not aware of it.

- `javax.faces.context.ExternalContext` uses `ServletContext`, `HttpSession`, `HttpServletRequest` and `HttpServletResponse`.

**Reference:**
---

- https://refactoring.guru/design-patterns/facade