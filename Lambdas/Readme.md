
# Lambdas

Lambda expressions are a powerful feature introduced in Java 8 that allows you to treat functionality as a method argument, which facilitates writing more concise and expressive code. Lambda expressions essentially provide a way to represent an anonymous function—an implementation of a functional interface without the need to explicitly define a separate class.

Here's a detailed breakdown of lambda expressions in Java:

### Syntax

The syntax of a lambda expression consists of three parts:
1. **Parameters**: These are the input parameters to the lambda expression. They can be empty or can have one or more parameters.
2. **Arrow Token (`->`)**: It separates the parameter list from the body of the lambda expression.
3. **Body**: It contains the code that defines the behavior of the lambda expression. It can be a single expression or a block of code enclosed in curly braces.

The basic syntax of a lambda expression is:

```
(parameters) -> expression
```
or
```
(parameters) -> { statements; }
```

### Example

Let's consider an example where we have a functional interface `MathOperation` with a single method `operate(int a, int b)` which performs some mathematical operation on two integers and returns the result.

```java
interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Using lambda expression to implement addition
        MathOperation addition = (int a, int b) -> a + b;
        
        // Using lambda expression to implement subtraction
        MathOperation subtraction = (a, b) -> a - b;
        
        // Using lambda expression with a block of code
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        
        // Using lambda expression with a single statement
        MathOperation division = (int a, int b) -> a / b;
        
        // Output results
        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Subtraction: " + subtraction.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
        System.out.println("Division: " + division.operate(5, 3));
    }
}
```

### Benefits

Lambda expressions bring several benefits to Java programming:
1. **Conciseness**: They allow you to write more concise code, especially for simple tasks.
2. **Readability**: They improve code readability by allowing you to express the behavior of methods more clearly and directly.
3. **Flexibility**: They facilitate writing code that's more flexible and adaptable to different scenarios.
4. **Parallelism**: They support parallel programming by enabling the use of streams and parallel streams.

### Target Types

Lambda expressions are associated with functional interfaces, which are interfaces with a single abstract method (SAM). The compiler infers the target type of a lambda expression from the context in which it's used, which must be a functional interface. This allows lambda expressions to be used in place of instances of the functional interface.

### Limitations

While lambda expressions provide a convenient way to implement functional interfaces, they have some limitations:
- They cannot access non-final local variables from the enclosing scope unless those variables are effectively final.
- They cannot modify variables from the enclosing scope.


