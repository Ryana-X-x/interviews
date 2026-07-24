## Definition

The **Garbage Collector (GC)** is a JVM component that automatically frees heap memory by removing **objects that are no longer reachable**.

This prevents unnecessary memory consumption and reduces manual memory management.

---

## How Garbage Collection Works

### Step 1: Objects are Created

```
Person p = new Person();
```

Object is stored on the heap.

---

### Step 2: Object Becomes Unreachable

```
p = null;
```

or

```
p = new Person();
```

The old object has no references pointing to it.

It becomes **eligible for garbage collection**.

---

### Step 3: Garbage Collector Runs

The JVM periodically:

- Finds unreachable objects.
- Frees their memory.
- Makes that memory available for future objects.

---

## Reachable vs Unreachable

```
Person p1 = new Person();
Person p2 = new Person();

p1 = null;
```

Heap

```
Person A  ← No references ❌ (Eligible for GC)

Person B  ← Referenced by p2 ✅
```

Only **Person A** can be collected.

---

## Generational Garbage Collection

The JVM divides the heap into generations because **most objects die young**.

### Young Generation

- New objects are created here.
- Collected frequently.
- Fast garbage collection.

Example:

```
new String("Hello");
new ArrayList<>();
```

---

### Old Generation

Objects that survive multiple garbage collection cycles are promoted here.

Collected less frequently because these objects are expected to live longer.

Example:

```
Spring Beans
Database Connection Pools
Application Cache
```

---

## Can GC Prevent Memory Leaks?

### Yes (Partially)

GC removes **unreachable objects**.

### No

If an object is **still referenced**, GC cannot remove it—even if your application no longer needs it.

Example:

```
List<Person> cache = new ArrayList<>();

cache.add(new Person());
```

As long as `cache` references the object, it cannot be garbage collected.

---

## Interview Keywords

- Reachable Objects
- Unreachable Objects
- Heap Memory
- Young Generation
- Old Generation
- Minor GC
- Major/Full GC
- Memory Leak

---

## 30-Second Interview Answer

> The JVM Garbage Collector automatically manages heap memory by identifying and removing objects that are no longer reachable from the application. It uses generational garbage collection, where new objects are allocated in the Young Generation and long-lived objects are promoted to the Old Generation. Young Generation collections occur more frequently, while Old Generation collections are less frequent. Garbage collection helps reclaim unused memory but cannot remove objects that are still referenced.