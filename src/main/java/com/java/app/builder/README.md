
ref - https://refactoring.guru/design-patterns/builder

Use cases
1. Use the Builder pattern to get rid of a "telescopic constructor" ( many constructors with optional params )
2. Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
3. Use the Builder to construct Composite trees or other complex objects.
4. A complex object needs to be created with relatively the same steps.
5. **Unlike other creational patterns, Builder doesn’t require products to have a common interface.**
    1. Hence build method has to be implemented in concrete class.

Pros<br>
1. Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.
2. You can reuse the same construction code when building various representations of products.


**description-**
1. `Car` and `Auto` are two Product types which can be built which donot have a common parent interface.
2. Also multiple types of cars can be built.
3. `Director` class contains the reciepies for building these.
4. `Director` uses the `Builder` to create those reciepies.
5. The final `build()` method is part of the Concrete builder as it has to return the correct class.