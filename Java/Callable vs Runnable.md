## Runnable

Represents a task that **does not return a result**.

Method:

```
run()
```

Characteristics:

- No return value.
- Cannot throw checked exceptions directly.

Example:

```
Runnable task = () -> {
    System.out.println("Running...");
};
```

---

## Callable

Represents a task that **returns a value**.

Method:

```
call()
```

Characteristics:

- Returns a result.
- Can throw checked exceptions.
- Submitted to an `ExecutorService`.
- Returns a `Future`.

Example:

```
Callable<Integer> task = () -> 100;
```

Execution:

```
ExecutorService executor = Executors.newSingleThreadExecutor();

Future<Integer> future = executor.submit(task);

System.out.println(future.get());
```

---

## Comparison

|Feature|Runnable|Callable|
|---|---|---|
|Return Value|❌ No|✅ Yes|
|Checked Exceptions|❌ No|✅ Yes|
|Method|`run()`|`call()`|
|Result|None|`Future<T>`|

---

## Interview Keywords

- ExecutorService
- Future
- Multithreading
- Asynchronous Programming
- Thread Pool

---

## 30-Second Interview Answer

> `Runnable` represents a task that performs work without returning a result and cannot throw checked exceptions. `Callable` represents a task that returns a value, can throw checked exceptions, and is typically submitted to an `ExecutorService`, which returns a `Future` for retrieving the result.

---