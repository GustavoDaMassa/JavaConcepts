
# Optional 

The term "optional" usually refers to the `java.util.Optional` class introduced in Java 8. `Optional` is a container object that may or may not contain a non-null value. It is used to represent optional values instead of using null references.

Here's a breakdown of how `Optional` works:

1. **Creating an Optional**: You can create an `Optional` instance using its static methods:
   ```java
   Optional<String> optionalString = Optional.of("Hello");
   ```

   This creates an `Optional` object containing the specified non-null value. If you're unsure whether the value might be null, you can use `Optional.ofNullable()`:
   ```java
   Optional<String> optionalNullableString = Optional.ofNullable(possiblyNullString);
   ```

   This will create an `Optional` with a value if the provided value is not null, or an empty `Optional` if the value is null.

2. **Accessing the Value**: You can retrieve the value from an `Optional` using several methods:
   - `get()`: Retrieves the value if it's present, or throws a `NoSuchElementException` if it's empty. It's recommended to avoid using this method without checking if a value is present.
   - `orElse(T other)`: Returns the value if present, or the specified default value if it's empty.
   - `orElseGet(Supplier<? extends T> other)`: Returns the value if present, or generates a default value using the provided supplier if it's empty.
   - `orElseThrow(Supplier<? extends X> exceptionSupplier)`: Returns the value if present, or throws an exception produced by the provided supplier if it's empty.

