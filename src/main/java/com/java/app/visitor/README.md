
**Goal:**
---
Allows you to new behaviours to complex object trees, by modifying it only once initially. After that new behaviours can be added without modifying the code ever again.

It uses a technique called `Double Dispatch`.

- basically it allows *each node to call the correct method on the visitor*, corresponding to its concrete class. The concrete objects call the methods, hence there is no ambiguity, even if there is complex in heritance involved.

**Double Dispatch:**
---
- Note - allows dynamic binding along with overloaded methods.

- `NodeA => node.accept(Visitor v) { v.visitNodeA(this); }`
- `NodeB => node.accept(Visitor v) { v.visitNodeB(this); }`
- `Visitor => visit(NodeA nodeA) { process(nodeA) }`
- `Visitor => visit(NodeB nodeB) { process(nodeB) }`

**Uses:**
---
Adding an `XML Export` to all concrete subclasses of a Node. Then adding `JSON Export` and other kinds of node based processing, without changing the Node class again.

**JDK Uses:**
---
- `java.nio.file.FileVisitor` and `SimpleFileVisitor`
- `javax.lang.model.element.Element` and `ElementVisitor`

**Pros:**
---
- Open/Closed Principle. Adding new behaviour on objects of different classes without changing them.
- Ability to add complex behaviour to a hierarchy, by adding the behaviour to each object.

**Cons:**
---
- You need to update all visitors each time a class gets added or removed from the element hierarchy.
- Visitors may lack the necessary access to the private fields and menthods of elements that they are supposed to work with.