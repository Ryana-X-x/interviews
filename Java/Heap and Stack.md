## Stack Memory

Stack memory stores:

- Local variables
- Method call frames
- Method parameters
- References to objects

Each thread has its **own stack**, making it thread-safe.

Memory is automatically allocated and deallocated as methods are called and return.

### Characteristics

- Very fast access
- Automatically managed
- Smaller in size
- Thread-specific
- Stores primitive variables and object references (not the actual objects)

---

## Heap Memory

Heap memory stores:

- Objects
- Instance variables
- Arrays

All threads share the heap.

Memory is managed by the **Garbage Collector (GC)**.

### Characteristics

- Larger than stack memory
- Shared among all threads
- Slower access than stack
- Stores actual objects
- Managed by the Garbage Collector

---

## Memory Example

```
public class Main {

    public static void main(String[] args) {

        int x = 10;
        Person p = new Person();

    }
}

class Person {
    int age = 20;
}
```

### Stack

```
main()

x = 10

p -----------+
             |
```

### Heap

```
Person Object

age = 20
```

The variable `p` is stored on the **stack**, while the `Person` object is stored on the **heap**.

---

## Comparison

|Feature|Stack|Heap|
|---|---|---|
|Stores|Local variables, method calls, references|Objects, arrays|
|Managed By|JVM automatically|Garbage Collector|
|Shared|No (per thread)|Yes|
|Speed|Faster|Slower|
|Size|Smaller|Larger|

---

## Interview Keywords

- Local Variables
- Method Stack
- Heap Objects
- Object References
- Garbage Collector
- Thread-specific
- Shared Memory

---

## 30-Second Interview Answer

> Stack memory stores method call frames, local variables, and object references. It is thread-specific, automatically managed, and provides very fast access. Heap memory stores actual objects and arrays, is shared among all threads, and is managed by the JVM's Garbage Collector. Stack memory is generally smaller and faster, while heap memory is larger but slower to access.