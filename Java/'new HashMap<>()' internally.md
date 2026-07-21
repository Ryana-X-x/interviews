# What happens internally when you write `new HashMap<>()`?

## Step 1: HashMap object is created

```
HashMap<String, Integer> map = new HashMap<>();
```

A `HashMap` object is created on the heap.

Initially (Java 8+):

- The internal bucket array (`table`) is **not allocated immediately**.
- `table = null`
- `size = 0`
- `loadFactor = 0.75`
- Default capacity is recorded as **16** (used when the first insertion occurs).

> **Note:** Modern Java lazily allocates the bucket array to save memory.

---

## Step 2: First `put()` call

```
map.put("Apple", 100);
```

Since `table` is `null`:

- A bucket array of **16 buckets** is created.
- Each bucket is initially `null`.

```
Bucket Array

0  -> null
1  -> null
2  -> null
...
15 -> null
```

The bucket array is **contiguous in memory**.

Each bucket stores only a **reference (pointer)** to the first node in that bucket.

---

## Step 3: Calculate the hash

HashMap computes

```
hash = key.hashCode();
```

Example:

```
"Apple".hashCode()
```

---

## Step 4: Spread (Mix) the hash

Java mixes the hash bits to reduce collisions.

Conceptually:

```
hash = hash ^ (hash >>> 16);
```

This improves the distribution of keys across buckets.

---

## Step 5: Find the bucket

Bucket index:

```
index = hash & (capacity - 1);
```

For capacity = 16:

```
index = hash & 15;
```

The key-value pair is stored in the calculated bucket.

---

## Step 6: Create an Entry (Node)

Each key-value pair is stored inside a `Node`.

Conceptually:

```
Node {
    int hash;
    K key;
    V value;
    Node next;
}
```

One key-value pair = **One Entry (Node)**

The Node is allocated **separately on the heap**.

It is **not stored inside the bucket array**.

---

## Step 7: Handle collisions

If another key maps to the same bucket:

Before Java 8:

```
Bucket

↓

A

↓

B

↓

C
```

Linked List

Since Java 8:

If a bucket contains **more than 8 entries** (and the table capacity is at least 64), the linked list is converted into a **Red-Black Tree**.

This process is called **Treeification**.

---

## Step 8: Resize when needed

HashMap maintains:

```
Threshold = Capacity × Load Factor
```

Default values:

```
Capacity = 16
Load Factor = 0.75

Threshold = 12
```

When

```
size > threshold
```

HashMap:

- Creates a new bucket array (double the capacity)
- Recalculates the bucket index for every existing entry (rehashing)
- Moves all entries into the new table

Example:

```
16 → 32 → 64 → 128 ...
```

---

# Important Terminology

### Bucket

One slot in the internal array.

```
table[0]
table[1]
...
table[15]
```

A bucket stores only a reference to the first node.

---

### Entry (Node)

One key-value pair.

```
Key = "Apple"
Value = 100
```

Internally stored as a `Node`.

---

### Capacity

The total number of buckets.

Default:

```
16
```

---

### Size

The total number of key-value pairs stored.

Example:

```
map.put("A",1);
map.put("B",2);
map.put("C",3);

Size = 3
```

---

### Load Factor

Determines **when to resize**.

```
Load Factor = 0.75
```

Threshold:

```
Capacity × Load Factor
```

Default:

```
16 × 0.75 = 12
```

---

# Time Complexity

|Operation|Average|Worst Case|
|---|---|---|
|`put()`|O(1)|O(log n)|
|`get()`|O(1)|O(log n)|
|`remove()`|O(1)|O(log n)|

---

# 45-Second Interview Answer

> When `new HashMap<>()` is executed, a `HashMap` object is created. In Java 8+, the internal bucket array is not allocated until the first `put()` call. On the first insertion, a bucket array of default capacity 16 is created with a load factor of 0.75. The key's `hashCode()` is computed, mixed to improve distribution, and mapped to a bucket using `hash & (capacity - 1)`. A `Node` containing the key, value, hash, and a `next` reference is created and linked into that bucket. If collisions occur, entries form a linked list, and if a bucket grows beyond 8 entries (with sufficient table capacity), it is converted into a red-black tree. When the number of entries exceeds `capacity × load factor`, the table is resized, and all entries are rehashed into the new bucket array.