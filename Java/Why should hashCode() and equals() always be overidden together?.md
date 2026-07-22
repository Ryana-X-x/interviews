## Rule

> **If two objects are equal according to `equals()`, they MUST return the same `hashCode()`.**

---

## Why?

Collections like **HashMap** and **HashSet**:

1. Use `hashCode()` to find the bucket.
2. Use `equals()` to find the exact object inside that bucket.

If the hash codes differ, Java looks in the wrong bucket and never calls `equals()`.

---

## Example

```
Person p1 = new Person("John");
Person p2 = new Person("John");

p1.equals(p2) == true
```

If

```
p1.hashCode() != p2.hashCode()
```

HashMap treats them as different keys.

---

## Interview Keywords

- Hash Contract
- Same hash for equal objects
- HashMap
- HashSet

---

## 30-Second Interview Answer

> `HashMap` first uses `hashCode()` to locate a bucket and then uses `equals()` to compare keys within that bucket. Therefore, if two objects are equal according to `equals()`, they must return the same hash code. Otherwise, collections like `HashMap` and `HashSet` behave incorrectly.