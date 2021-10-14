# SOLID Principles
This Project contains working examples for each of SOLID principles.

S -> Single Responsibility Principle. <br>
O -> Open/Closed Principle. <br>
L -> Liskov Substitution Principle. <br>
I -> Interface Segregation  Principle. <br>
D -> Dependency Injection. <br>

SOLID design principles are the specifications and design pattern are the concrete implementations.


## Single Responsibility Principle
* Every Software entity (class or method) should have only a single reason to change. 
* If the class or method does multiple operations then it is advisable to separate into distinct classes.
* Can be done easily with the help of Intefaces.
* Each class or method handle just a single responsibility , if there are 2 reasons to change a given class then it is a sign of violation of the SRP.
* SRP helps in reducing the tight coupling and this is how we can achieve loosely coupled software components.

### Code Demonstration
* com.suraj.srp package has App class that takes input from the user and produce the sum of the inputs. 
* As part of the main program User inputs taken using Scanner class , Inputs are validated ( Allowed inputs are Integers only ) and finally is returned to the user.<br>
* com.suraj.srp.refactor package contains the refactored code. App main class refactored to create separate class InputProcessor to take user Input, ViolationChecker class to check if the input provided is an Integer or not. 
* Lastly the Operation class created to execute the Sum operation on the input pair.<br>

### Key Benefits
* By creating separate class for taking the user Input , Validation of Input and Operation class helps in reducing the Tight coupling.
* Each of the functionalities can be independently enhanced without impacting the main App class. 
Logic of Validation, Operation completely abstracted.   

## Open Closed Principle
* Changes in the existing code should be minimized.
* Its assumed that existing code already tested and changes might affect the existing functionality in an unwanted manner.
* Open/Closed Principle : Software entities should be open for extension and closed for modification.  
* Design and writing of Code should be done in a way that new functionality can be added with minimum changes in the existing code.
* Closely related to Single Responsibility Principle.
* Class should not extend other class explicitly - we should define common interface instead.
* There are 2 important design patterns that guarantee that open/closed principle not violated: 
   1) Strategy Pattern.
   2) Template Pattern.
  
### Code Demonstration
* com.suraj.ocp package has Multiple Interview Question classes that implements a common Interface "Interview Question".
* Each Interview Question class overrides execute method vy its own implementation.
* Interview Question Processor has no knowledge about Interview Question types. It calls the execute method.
* This is a typical implementation of loosely coupled system.

## Liskov Substitution Principle
* Objects of a Superclass shall be replaceable with objects or its subclases without breaking the application.
* Subtype must be substitutable for their base types. Child class should never break the parent class type definition.
* Violation of Liskov principle is a latent violation of open/closed principle.

### Code Demonstration
* com.suraj.lsp package has Vehicle Abstract class that implements Fuel Interface. Fuel behavior has been abstracted to ensure Car can implement their own implementations. 
* Liskov substitution principle can be achieved using Abstract class or through interface.

## Interface Segregation Principle
* Software modules should not be forced to depend upon the interface that they do not use. 
* Sometimes we want to implement a given interface just for the sake of the methods defined in the interface. 
* We end up with fat interfaces - containing more methods than actual class needs.
* It's not good if an interface has large number of methods.
* When possible we should break interface in many smaller ones, so they better satisfy clients needs.

### Code Demonstration
* com.suraj.isp package has Tree Interface that contains multiple methods. 2 of the methods are specific to Balanced Tree.
* Tree interface is a fat interface because it has methods that will not be used by implementing class i.e., Binary Search Tree .  
* This forces us to implement empty implementation for the methods which are not applicable to Binary Search Tree. 
* com.suraj.isp.refactor package contains refactored code where the Rotation specific methods taken out and new Interface RotationTree is created.