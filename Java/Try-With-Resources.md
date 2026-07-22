## Purpose

Automatically closes resources that implement the **AutoCloseable** interface.

---

## Example

```
try (FileInputStream fis = new FileInputStream("a.txt")) {

    // Read file

}
```

No need to call:

```
fis.close();
```

Java does it automatically.

---

## Benefits

- Cleaner code
- Prevents resource leaks
- Automatically closes resources
- Exception-safe cleanup
- Works with any class implementing `AutoCloseable`

---

## Common Resources

- `FileInputStream`
- `BufferedReader`
- `Scanner`
- `Connection`
- `PreparedStatement`

---

## Interview Keywords

- AutoCloseable
- Automatic cleanup
- Resource Leak
- Exception Safety

---

## 30-Second Interview Answer

> Try-with-resources automatically closes resources that implement the `AutoCloseable` interface after execution completes, even if an exception occurs. It reduces boilerplate code, prevents resource leaks, and ensures exception-safe cleanup.