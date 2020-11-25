

ref - https://refactoring.guru/design-patterns/command

**when to use:** It turns a request into a stand alone object. allowing you to
- make remote calls, by serializing requests
- add reversibility
- log history
- creates a new layer for passing commands from requester -> executor.

**JDK Usecase:**
- `java.lang.Runnable`
- `javax.swing.Action`

**Points on Implementation:**
- It follows the refactoring guru example as I find it more fleshed out.

**References:**
- https://www.journaldev.com/1624/command-design-pattern
- https://refactoring.guru/design-patterns/command