## Builder Design Pattern

### Behavior
- **Chained Method Calls**: The Builder pattern allows you to construct a complex object step by step using chained method calls. Each method returns the builder itself, enabling method chaining.
- **Encapsulation of Construction Logic**: The actual process of constructing the object is encapsulated in another class (the builder), which is responsible for creating and assembling the parts of the object. The builder then returns the final constructed object.

### Pros
- **Improved Unit Testing**: The Builder pattern makes it easy to create objects for testing purposes. You can build objects with only the required fields and select optional fields as needed, making tests more flexible and readable.
- **Readable and Maintainable Code**: By using method chaining and separating the construction logic from the object itself, the code becomes more readable and maintainable. Each step of the object creation is clearly defined.
- **Flexibility and Scalability**: The pattern provides flexibility in creating various configurations of an object. You can easily add new fields or steps in the construction process without changing the client code.

### Cons
- **Increased Complexity**: Introducing a builder class adds additional complexity to the code. This may be overkill for simple objects with only a few fields.
- **Verbose Code**: The pattern can lead to more verbose code, as you need to create a separate builder class for each complex object.

Related Links
- [Builder Design Pattern - GeeksforGeeks](https://www.geeksforgeeks.org/builder-design-pattern/)
- [Builder Design Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/builder)
- [Builder Pattern in Java - Baeldung](https://www.baeldung.com/java-builder-pattern)

