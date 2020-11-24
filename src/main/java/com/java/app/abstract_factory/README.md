
ref - https://refactoring.guru/design-patterns/factory-method

Main Goal - it lets you produce *"families of related objects"* without specifying their concrete classes. Allows you to change the factory based on some condition, which effects all created objects on some way.

e.g.
Gui Factories ( Win/Mac/Linux/HTML )

**Advantages :** 
At run time we can re-configure the factory and the client <br> 
code remains unchanged,still having the ability to create  <br>
the new elements for the new factory.