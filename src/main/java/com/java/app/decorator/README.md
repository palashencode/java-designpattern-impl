
ref refactoring guru - https://refactoring.guru/design-patterns/decorator

1. Create an interface for the base class(FileDataSource) that needs to be decorated, DataSource
2. Implement a BaseDecorator that wraps the Interface - DataSourceBaseDecorator
3. Add Concrete Decorators that extend the Base decorator. - CompressDecorator,EncryptDecorator.
4. Now the decorators can be chained at runtime.

Advantage
1. When can chain and decorate extra behaviours at runtime.
2. We can add new behaviours ( decorators ) and chain them.
3. Client code need not change, it will still use all decorated objects the same way.

Cons:
1. Hard to remove a specific wrapper from the wrapper stack

How to see the advantage : 
- want to add a new functionality ? - *add a decorator and add it in the chain while creating datasource.* 
- no client code needs to change.