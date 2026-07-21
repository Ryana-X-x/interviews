The reasoning, not just the answer: an LRU cache needs **two operations in O(1)**:

1. **Get(key)** — look up a value fast → needs a hash map.
2. **Put(key, value)** — insert, and if over capacity, evict the _least recently used_ item, and mark whatever was just accessed as _most recently used_ → needs to reorder items fast.

Why not just a HashMap alone? Because a HashMap has no concept of "order of use" — you'd need to scan everything to find the least recently used item → O(n).

Why not just a Linked List alone? Because finding a specific key to move it to the front would require O(n) traversal to _locate_ it.

**Combining them** solves both: the HashMap maps `key → node reference` (O(1) lookup), and the Doubly Linked List keeps nodes ordered by recency, with **O(1) removal and insertion** because you have direct node references (no traversal needed) and doubly-linked pointers let you unlink a node from the middle without walking the list.

java

```java
class LRUCache {
    class Node { int key, value; Node prev, next; }
    Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(), tail = new Node(); // dummy sentinels
    int capacity;

    LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    // get(): move node to front, return value
    // put(): if exists, update+move to front; else insert at front,
    //        evict tail.prev if over capacity
}
```