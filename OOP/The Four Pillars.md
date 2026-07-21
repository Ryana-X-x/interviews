## **Encapsulation**:
bundling data with the methods that operate on it, and hiding internal state behind access modifiers.

```java
public class BankAccount {
    private double balance; // hidden — no one can set balance = -1000 directly

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
}
```
The point isn't "private fields, public getters" — it's that you control _how_ the state can change, so invariants (like balance never going negative) can't be violated from outside.

---

## **Abstraction**:
Exposing what something does, hiding how. Interfaces ware the classic example:
```java
interface PaymentProcessor {
    void pay(double amount);
}
class StripeProcessor implements PaymentProcessor {
    public void pay(double amount) { /* Stripe-specific API calls */ }
}
```

Calling code just does `processor.pay(100)` — it doesn't know or care if it's Stripe, PayPal, or a mock in tests. This is what makes code swappable and testable.

## **Inheritance**:
An "is-a" relationship where a subclass reuses and extends a parent's behavior:

java

```java
class Vehicle {
    void start() { System.out.println("Engine starting"); }
}
class Car extends Vehicle { }
```

Interviewers often probe: **favor composition over inheritance** when the relationship isn't truly "is-a" — a classic gotcha (e.g., `Stack extends Vector` in Java is considered a design mistake).

## **Polymorphism** 
Same interface, different behavior at runtime.

java

```java
Vehicle v = new Car(); // or new Truck()
v.start(); // calls whichever start() the actual object has
```

This is **runtime polymorphism** via method overriding (dynamic dispatch). Compile-time polymorphism is method _overloading_ (same name, different params) — worth distinguishing if asked which kind they mean.