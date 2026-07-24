## Definition

A **deadlock** occurs when two or more processes are **waiting indefinitely** for resources held by each other.

As a result:

- No process can continue.
- No resource is released.
- The system becomes stuck.

---

## Example

Imagine two processes:

```
Process P1 has Resource A

Needs Resource B
```

```
Process P2 has Resource B

Needs Resource A
```

Result:

```
P1 waits for B

↓

P2 waits for A

↓

Neither can continue
```

This is a **deadlock**.

---

## Coffman Conditions

A deadlock can occur **only if all four conditions are true**.

---

### 1. Mutual Exclusion

A resource can be used by only one process at a time.

Example:

Printer

Only one process can use it.

---

### 2. Hold and Wait

A process is holding one resource while waiting for another.

Example:

```
P1 holds Printer

Waiting for Scanner
```

---

### 3. No Preemption

Resources cannot be forcibly taken away.

The process must release them voluntarily.

---

### 4. Circular Wait

Processes form a circular chain.

```
P1 waits for P2

↓

P2 waits for P3

↓

P3 waits for P1
```

---

## Preventing Deadlock

A deadlock is impossible if **any one** of the Coffman conditions is removed.

Examples:

- Allow resource preemption.
- Prevent circular waiting.
- Require processes to request all resources at once.

---

## Interview Keywords

- Resource Allocation
- Process Synchronization
- Coffman Conditions
- Circular Wait
- Deadlock Prevention

---

## 30-Second Interview Answer

> A deadlock occurs when two or more processes wait indefinitely for resources held by one another. Four conditions are required for a deadlock: mutual exclusion, hold and wait, no preemption, and circular wait. Eliminating any one of these conditions prevents deadlock.