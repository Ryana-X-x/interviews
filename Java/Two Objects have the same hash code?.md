## Same Hash Code ≠ Same Object

Two different objects can have the same hash code.

This is called a **collision**.

---

## What happens?

1. Both objects are placed in the **same bucket**.
2. Java compares them using `equals()`.
3. If `equals()` returns:
    - `true` → Existing value is updated.
    - `false` → Both entries are stored in the bucket.

---

## Java 8+

If a bucket contains **more than 8 entries** (and the table capacity is at least 64), the linked list becomes a **Red-Black Tree**.

Lookup improves from:

```
O(n)

↓

O(log n)
```

---

## Interview Keywords

- Collision
- Same Bucket
- `equals()`
- Treeification
- Red-Black Tree

---

## 30-Second Interview Answer

> If two objects have the same hash code, they are placed in the same bucket. Java then calls `equals()` to determine whether they represent the same key. If they are equal, the existing value is replaced; otherwise, both entries are stored. In Java 8+, long collision chains are converted into red-black trees for better worst-case performance.