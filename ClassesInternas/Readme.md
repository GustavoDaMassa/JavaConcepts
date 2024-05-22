In Java, an internal class is often referred to as a nested class. Nested classes are classes defined within the scope of another class. There are four types of nested classes in Java:

1. **Static Nested Class**
2. **Inner Class (Non-static Nested Class)**
3. **Local Inner Class**
4. **Anonymous Inner Class**

### 1. Static Nested Class

A static nested class is a static member of the outer class. It can be accessed without an instance of the outer class. Since it is static, it cannot access non-static members of the outer class directly.

```java
class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
```

### 2. Inner Class (Non-static Nested Class)

An inner class is a non-static nested class. It has access to all members of the outer class, including private members. It can only be instantiated through an instance of the outer class.

```java
class OuterClass {
    class InnerClass {
        void display() {
            System.out.println("Inside inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();
    }
}
```

### 3. Local Inner Class

A local inner class is defined within a block, typically inside a method. It is only accessible within the block where it is defined. It can access final or effectively final variables of the enclosing block.

```java
class OuterClass {
    void display() {
        class LocalInnerClass {
            void localDisplay() {
                System.out.println("Inside local inner class");
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.localDisplay();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        outerObject.display();
    }
}
```

### 4. Anonymous Inner Class

An anonymous inner class is a local inner class without a name. It is used for instantiating objects with certain "extras," such as method overrides, all in a concise manner. Anonymous inner classes are often used in GUI applications.

```java
abstract class Animal {
    abstract void makeSound();
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            void makeSound() {
                System.out.println("Woof Woof");
            }
        };
        dog.makeSound();
    }
}
```

### Summary

- **Static Nested Class:** Can access outer class's static members; instantiated without outer class instance.
- **Inner Class:** Can access all members of the outer class; instantiated with outer class instance.
- **Local Inner Class:** Defined within a method or a block; limited scope to that block.
- **Anonymous Inner Class:** Defined and instantiated in a single expression; used for classes with single-use or brief implementations.

Nested classes provide a way to logically group classes that are only used in one place, increasing encapsulation and readability of the code.