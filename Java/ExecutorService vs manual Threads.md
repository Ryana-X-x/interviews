# Threads

## `ExecutorService`

- Uses a **thread pool**.
- Reuses existing threads.
- Better performance.
- Better scalability.
- Supports task queues.
- Easier lifecycle management (`shutdown()`, `shutdownNow()`).

---

## Creating Threads Manually

```
new Thread(...).start();
```

- Creates a new thread every time.
- Expensive to create and destroy.
- Doesn't reuse threads.
- Poor scalability.
- Harder to manage thread lifecycle.

---

## Why is `ExecutorService` better?

Suppose you have **1000 tasks**.

### Manual Threads

```
1000 Tasks

↓

1000 Threads
```

High memory usage and frequent context switching.

---

### ExecutorService

```
1000 Tasks

↓

Thread Pool (10 Threads)

↓

Tasks execute one by one as threads become free
```

Much more efficient.

---

## Interview Keywords

- Thread Pool
- Thread Reuse
- Scalability
- Task Queue
- Lifecycle Management
- `shutdown()`

---

## 30-Second Interview Answer

> `ExecutorService` manages a pool of reusable threads, making it more efficient and scalable than creating threads manually. It reduces thread creation overhead, supports task queues, and provides lifecycle management methods such as `shutdown()`. Creating threads manually is suitable only for simple or one-off tasks.