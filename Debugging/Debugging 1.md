- Binary Search Debugging
```java
public static boolean search(int[] arr, int target) {

    int low = 0;
    int high = arr.length;

    while (low <= high) {

        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return true;

        if (arr[mid] < target)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return false;
}
```
---
## Bug 1 ❌

```
int high = arr.length;
```

Should be

```
int high = arr.length - 1;
```

### Why?

Array indices go from

```
0

↓

arr.length - 1
```

Using `arr.length` can cause an **ArrayIndexOutOfBoundsException**.

---

## Bug 2 ⚠️

```
int mid = (low + high) / 2;
```

Better:

```
int mid = low + (high - low) / 2;
```

### Why?

Avoids integer overflow when `low` and `high` are very large.

---

## Interview Keywords

- ArrayIndexOutOfBoundsException
- Integer Overflow
- Binary Search
- Mid Calculation

---

## Correct Code

```
int low = 0;
int high = arr.length - 1;

while (low <= high) {

    int mid = low + (high - low) / 2;

    if (arr[mid] == target)
        return true;

    if (arr[mid] < target)
        low = mid + 1;
    else
        high = mid - 1;
}
```