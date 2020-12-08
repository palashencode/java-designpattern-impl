
# State Pattern

**Goal:**
---

- It allows the object to alter its behaviour, when its internal state changes. Its applicable when a object changes between certain fixed states.

**JDK Use:**
---

- `javax.faces.lifecycle.LifeCycle#execute()` - depends on the currently executing phase.

**Implemented Example:**
---

- The example is a `Player`, with certain fixed states like `Locked`,`ReadyState`, `PlayingState`.


**How:**
---

- Creating a sub-class for each state and then switch between the sub-classes.

- The reason it's different from `Strategy`, because, states are actively aware of each other, and can initiate switchs.

**Pros:**
---

- Single Responsibility Principle, because we can contain teh logic related to a state to a particular class.

- Open/Closed Principle. Introduce a new state without changing existing state classes.

**Cons:**
---

- Not always a good fit. Must have a lot of clearly defined switchable states for it to make sense.
