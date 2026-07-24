## Definition

`Optional<T>` is a container object that may or may not contain a value.

It helps represent **optional values explicitly** instead of using `null`.

---

## Without Optional

```
String name = getName();

System.out.println(name.length());
```

If `name` is `null`:

```
NullPointerException
```

---

## With Optional

```
Optional<String> name = getName();
```

Safely handle missing values.

```
name.ifPresent(System.out::println);
```

or

```
String value = name.orElse("Unknown");
```

---

## Benefits

- Reduces `NullPointerException`
- Makes APIs more expressive
- Forces developers to handle missing values explicitly
- Improves readability

---

## Common Methods

```
optional.isPresent()

optional.ifPresent()

optional.orElse()

optional.orElseGet()

optional.orElseThrow()
```

---

## Interview Keywords

- Null Safety
- Java 8
- Optional Value
- NullPointerException
- Functional Programming

---

## 30-Second Interview Answer

> `Optional` is a Java 8 container that represents a value that may or may not be present. It reduces the risk of `NullPointerException`, makes APIs more expressive, and encourages developers to explicitly handle missing values using methods such as `orElse()`, `ifPresent()`, and `orElseThrow()`.