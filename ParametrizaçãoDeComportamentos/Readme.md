# Parameterizing behaviors in Java 

Is a concept that involves passing behavior (in the form of code) as parameters to methods, allowing you to write more flexible and reusable code. This is typically achieved using functional interfaces, lambda expressions, and method references, which were introduced in Java 8.

Here’s a detailed explanation of these concepts:


### Functional Interfaces

A functional interface is an interface with a single abstract method (SAM). These interfaces can be implemented using lambda expressions or method references, making it possible to pass behavior as a parameter.

Some common functional interfaces in Java are:
- `Runnable`: Represents a task that can be run.
- `Callable<V>`: Represents a task that returns a result.
- `Comparator<T>`: Represents a comparison function.
- `Function<T, R>`: Represents a function that takes an argument of type T and returns a result of type R.
- `Consumer<T>`: Represents an operation that takes an argument of type T and returns no result.
- `Supplier<T>`: Represents a supplier of results.

### Lambda Expressions

A lambda expression is a concise way to represent an anonymous function (i.e., a function without a name). It provides a clear and concise way to parameterize behavior.

The syntax of a lambda expression is `(parameters) -> expression` or `(parameters) -> { statements; }`.

Example:
```java
// Using a functional interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

// Using a lambda expression to parameterize behavior
public class Main {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name);
        greet.sayHello("Alice");
    }
}
```

### Method References

Method references are another way to parameterize behavior in Java. They provide a way to refer to methods directly by their names. There are four types of method references:
1. Reference to a static method: `ClassName::staticMethodName`
2. Reference to an instance method of a particular object: `instance::instanceMethodName`
3. Reference to an instance method of an arbitrary object of a particular type: `ClassName::instanceMethodName`
4. Reference to a constructor: `ClassName::new`

Example:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Using a lambda expression
        names.forEach(name -> System.out.println(name));
        
        // Using a method reference
        names.forEach(System.out::println);
    }
}
```

### Practical Example: Sorting with Comparator

Using functional interfaces and lambda expressions, you can easily parameterize sorting behavior.

Example:
```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Sort using a lambda expression
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);

        // Sort using a method reference
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);

        // Custom sorting behavior
        Comparator<String> reverseOrder = (a, b) -> b.compareTo(a);
        names.sort(reverseOrder);
        System.out.println(names);
    }
}
```

In this example, the `Comparator` interface is a functional interface used to parameterize the sorting behavior. The sorting behavior is passed as a lambda expression or method reference, making the code more flexible and reusable.

