
ref refactoring guru - https://refactoring.guru/design-patterns/factory-method/java/example

1. Design the abstract parent product(or interface) that all products or created objects must sub class. ( Button )
2. Design the abstract parent factory class that all factories must subclass. ( Dialog )

Advantage
1. When we need to create a new type of button
    a. Create a subclass of Dialog, and override it's createButton() method.
    b. Create a subclass of Button, and override it's render() method.
2. Client code need not change, it will still use Dialogs and Buttons in the same way.

Cons:
1. New Subclasses needed to be added for the Pattern.

How to see the advantage : 
- want to add a new skin type ? - *extend dialog and add a new button type.* 
- no client code needs to change.

<br>
Note - Note that the factory method doesn’t have to create new instances all the time. It can also return existing objects from a cache, an object pool, or another source.
