
ref - https://refactoring.guru/design-patterns/prototype

**When to apply**
1. Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.
2. Create a registry for commonly used objects

**Pros**
1. Clone objects without coupling to their concrete classes.
2. Get rid of repeated initialization code in favor of cloning pre-built prototypes.
3. Produce complex objects conveniently

**Cons**
1. Cloning complex objects that have circular references might be very tricky.

Java by default implements this pattern using the Clonable Interface. `Interface Cloneable`
<br>
A seperate registry object like `ShipRegistry` can be used to save/retrieve complex objects.