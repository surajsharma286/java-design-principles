**SOLID Principles**
This Project contains working examples for each of SOLID principles.

S -> Single Responsibility Principle <br>
O -> Open/Closed Principle <br>
L -> Liskov Substitution Principle <br>
I -> Interface Segregation  Principle <br>
D -> Dependency Injection <br>



## Single Responsibility Principle
* Every Software entity (class or method) should have only a single reason to change. <br>
* If the class or method does multiple operations then it is advisable to separate into distinct classes.
* Can be done easily with the help of Intefaces.
* Each class or method handle just a single responsibility , if there are 2 reasons to change a given class then it is a sign of violation of the SRP.
* SRP helps in reducing the tight coupling and this is how we can achieve loosely coupled software components.

### Code Demonstration
* com.suraj.srp package has App class that takes input from the user and produce the sum of the inputs. 
* As part of the main program User inputs taken using Scanner class , Inputs are validated ( Allowed inputs are Integers only ) and finally is returned to the user.<br>
* com.suraj.srp.refactor package contains the refactored code. App main class refactored to create separate class InputProcessor to take user Input, ViolationChecker class to check if the input provided is an Integer or not. 
* Lastly the Operation class created to execute the Sum operation on the input pair.<br>

#### Key Benefits
* By creating separate class for taking the user Input , Validation of Input and Operation class helps in reducing the Tight coupling.
* Each of the functionalities can be independently enhanced without impacting the main App class. 
Logic of Validation, Operation completely abstracted.   
