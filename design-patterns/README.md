# Design Patterns
Design Principles (such as SOLID) are high level guidelines to design reusable software applications. Design principles are programming language and platform independent.<br>
Design Patterns are low level solutions of frequent object oriented related problems.
Design pattern is the concrete implementation. Design patterns tested by others - these techniques are state-of-the-art problem specific solutions.
Design principles allow scalable and maintainable software architectures. Design patterns are more about how to design your code and concrete implementations of the design principles. 

## Creational Design Patterns
Creational patterns provide various object creation mechanisms which increase flexibility and reuse of existing code.
### Singleton Pattern
* Singleton pattern is a creational Design Pattern.
* Singleton lets you ensure that a class has only one instance while providing a global access point to that given instance.
* It ensures that given class has just single instance.
* Singleton pattern is easy to implement , it can become complex when multiple Threads/Process access the same instance.

##### When to Use ?
* Control Access to shared resources such as files, databases or Thread pools.
* It is extremely crucial for Logging.

#### Code Demonstration
* com.suraj.singleton package contains 2 implementation of Singleton pattern.
* DatabaseConnector class leverage Private Constructor with static getInstance method. GetInstance method has Synchronized block that blocks multiple Threads to create multiple instances. 
* DatabaseConnector class is not 100 % safe as multiple instance can be created through "Reflection Attack".
* Database class leverage Enum to create Singleton object of Database class.
* Database is 100% Thread safe as the Enums are Compile time constants.


### Factory Pattern
#### Code Demonstration
#### Key Benefits

### Builder Pattern
#### Code Demonstration
#### Key Benefits

### Prototype Pattern
#### Code Demonstration
#### Key Benefits

## Behavioral Design Patterns

### Strategy Pattern
#### Code Demonstration
#### Key Benefits

### Observer Pattern
#### Code Demonstration
#### Key Benefits

### Command Pattern
#### Code Demonstration
#### Key Benefits

### Iterator Pattern
#### Code Demonstration
#### Key Benefits

### Template Pattern
#### Code Demonstration
#### Key Benefits

### Null Object Pattern
#### Code Demonstration
#### Key Benefits

### Visitor Object Pattern
#### Code Demonstration
#### Key Benefits

## Structural Design Patterns

### Decorator Pattern
#### Code Demonstration
#### Key Benefits

### Facade Pattern
#### Code Demonstration
#### Key Benefits

### Flyweight Pattern
#### Code Demonstration
#### Key Benefits

### Adapter Pattern
#### Code Demonstration
#### Key Benefits

