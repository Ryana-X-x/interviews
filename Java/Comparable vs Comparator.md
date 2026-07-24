## Comparable

Defines the **natural ordering** of objects.

The sorting logic is implemented **inside the class**.

Uses:

```
compareTo()
```

Example:

```
class Student implements Comparable<Student> {

    int marks;

    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}
```

Sorts students by marks.

---

## Comparator

Defines **custom ordering**.

Sorting logic is implemented **outside the class**.

Uses:

```
compare()
```

Example:

```
Comparator<Student> byName =
    (a, b) -> a.name.compareTo(b.name);
```

Now you can sort by:

- Name
- Age
- Marks

without modifying the `Student` class.

---

## Comparison

|Feature|Comparable|Comparator|
|---|---|---|
|Package|`java.lang`|`java.util`|
|Method|`compareTo()`|`compare()`|
|Ordering|Natural|Custom|
|Implemented In|Same class|Separate class/object|
|Multiple Sorting Strategies|❌ No|✅ Yes|

---

## Interview Keywords

- Natural Ordering
- Custom Ordering
- compareTo()
- compare()
- Collections.sort()

---

## 30-Second Interview Answer

> `Comparable` is used to define the natural ordering of a class by implementing the `compareTo()` method within the class itself. `Comparator` defines custom sorting logic outside the class using the `compare()` method, allowing multiple sorting strategies without modifying the original class.