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
* DatabaseConnector class is not 100 % safe as multiple instance can be created through "Reflection Attack". Also, the Synchronized blocks are slower.
* Database class leverage Enum to create Singleton object of Database class.
* Database is 100% Thread safe as the Enums are Compile time constants.


### Factory Pattern
* Factory pattern helps to create loosely coupled OOP design.
* There is fundamental problem with new Keyword. We should favour abstraction (supertypes) instead of concrete implementations.
* Whenever we use new keyword (instantiate a class ), we definitely violate this principle.
* Trying to code to concrete classed makes the application fragile and less flexible.
* If we program to Interface - the code will work fine with any other classes implementing that interface

    Animal dog = AnimalFactory.getDog()
    
* We can instantiate the classes in a separate class - Factory. 
* We should separate static classes in the application from the classes that change frequently.

#### Code Demonstration
* com.suraj.factory package has AnimalFactory class that contains the logic to instantiate and return Object of type Animal based on the type of animal passed.
* Factory lets you add new Implementation of Animal types without introducing new keyword for each of new implementation of Animal Interface i.e., BobCat().
* We don't expose the creation logic to the client and refer created object using a standard interface.

### Abstract Factory Pattern
* Abstract Factory pattern helps to other factories ( factories of factories).
* It is an interface responsible for creating a factory of related objects without explicitly specifying their classes.
* Abstract factory create factory pattern , it is producing families of related objects.

![img.png](resources/img.png)

Abstract factory lets you create a Petrol Factory or an Electric Factory. Petrol factory will produce Petrol cars and Electric factory will produce Electric cars.
#### Code Demonstration
* com.suraj.abstractfactory package has 2 Factory classes for assembling Electric cars and Petrol Cars. 
* FactoryProducer class create the Car factory based on the Type of factory.



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

