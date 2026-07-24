public static int factorial(int n){

    if(n==1)
        return 1;

    return n * factorial(n-1);

}

---
## Bug 1 ❌

Missing base case:

```java
if (n == 0)
    return 1;
```

---

### Why?

Factorial is defined as:

```
0! = 1
```

Without this base case:

```
factorial(0)
```

becomes

```java
factorial(0)

↓

0 * factorial(-1)

↓

factorial(-2)

↓

factorial(-3)

↓

...
```

The recursion never stops.

Eventually:

```java
StackOverflowError
```

---

## Bug 2 ⚠️

Negative inputs are not handled.

Example:

```java
factorial(-5)
```

also results in infinite recursion.

---

## Correct Implementation

```java
public static int factorial(int n) {

    if (n < 0)
        throw new IllegalArgumentException("Negative numbers are not allowed.");

    if (n == 0 || n == 1)
        return 1;

    return n * factorial(n - 1);
}
```

---

## Interview Keywords

- Base Case
- Infinite Recursion
- StackOverflowError
- Input Validation
- Recursive Function

---

## 30-Second Interview Answer

> The original implementation misses the `n == 0` base case, causing `factorial(0)` to recurse indefinitely until a `StackOverflowError` occurs. It also doesn't validate negative inputs, which leads to the same issue. A correct solution handles both `0` and `1` as base cases and rejects negative numbers.