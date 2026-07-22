The core distinction interviewers want you to articulate is **visibility vs atomicity** — these are two different problems, and `volatile` only solves one.

**The visibility problem:** modern CPUs cache variables in per-core caches for speed. If Thread A updates a variable, Thread B (running on a different core) might keep reading a stale cached copy forever, never seeing the update. `volatile` fixes this — it forces every read to go to main memory and every write to flush to main memory immediately, so all threads see the latest value.

java

```java
private volatile boolean running = true;

// Thread 1
while (running) { /* do work */ }

// Thread 2
running = false; // without volatile, Thread 1 might never see this
```

**What `volatile` does _not_ do:** it doesn't make compound operations atomic.

java

```java
private volatile int count = 0;
count++; // NOT atomic! This is actually read -> increment -> write, 3 steps
```

Two threads can both read `count=5`, both increment locally to 6, both write 6 — you lost an increment. `volatile` guarantees each of those three steps sees fresh values, but it doesn't stop two threads from interleaving _between_ the steps.

**`synchronized`** solves this by using a **monitor lock** — only one thread can hold the lock at a time, so the whole block (read-modify-write) executes as one atomic unit, _and_ it happens to also guarantee visibility (releasing a lock flushes changes to memory, acquiring a lock refreshes from memory).

java

```java
private int count = 0;
public synchronized void increment() { count++; } // safe now
```

**Rule of thumb to say out loud in an interview:** use `volatile` for simple flags/status variables read by multiple threads but written by only one place logically (like a shutdown flag); use `synchronized` (or `AtomicInteger`/locks) when you need read-modify-write atomicity.