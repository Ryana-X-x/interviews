## Definition

**Dependency Injection (DI)** is a design pattern where an object **does not create its own dependencies**. Instead, the dependencies are **provided (injected)** by an external framework such as Spring.

---

## Without Dependency Injection

The class creates its own dependency.

```
class A {
    B b = new B();
}
```

### Problems

- Tight coupling
- Hard to replace implementations
- Difficult to unit test
- Violates the Dependency Inversion Principle (DIP)

---

## With Dependency Injection

Spring creates the object and injects it.

```
@Service
class A {

    private final B b;

    public A(B b) {
        this.b = b;
    }
}
```

Spring automatically provides an instance of `B` when creating `A`.

---

## Types of Dependency Injection

### Constructor Injection ✅ (Recommended)

```
public A(B b) {
    this.b = b;
}
```

Most commonly used because:

- Dependencies are mandatory.
- Supports immutable (`final`) fields.
- Easier to unit test.

---

### Setter Injection

Used when the dependency is optional.

```
public void setB(B b) {
    this.b = b;
}
```

---

### Field Injection

```
@Autowired
private B b;
```

Works, but generally **not recommended** because it makes testing harder and hides dependencies.

---

## Benefits

- Loose Coupling
- Easier Unit Testing (mock dependencies)
- Better Maintainability
- Easier to replace implementations
- Better Separation of Concerns

---

## Interview Keywords

- IoC (Inversion of Control)
- Dependency Injection
- Spring Container
- Bean
- Constructor Injection
- `@Service`
- `@Component`
- `@Autowired`

---

## 30-Second Interview Answer

> Dependency Injection is a design pattern where objects receive their dependencies instead of creating them themselves. In Spring Boot, the IoC container creates and manages beans and injects them where needed, typically through constructor injection. This reduces coupling, improves testability, and makes the application easier to maintain.