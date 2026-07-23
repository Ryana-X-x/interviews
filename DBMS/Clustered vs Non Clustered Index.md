## Clustered Index

- Determines the **physical order** of rows in the table.
- The table data itself is stored according to the clustered index.
- Only **one clustered index** per table.

### Example

Students table sorted by

```
Roll Number
```

Rows on disk are physically stored in Roll Number order.

---

## Non-Clustered Index

- Separate data structure.
- Contains index values and pointers to the actual rows.
- Does **not** change the physical storage order.
- Multiple non-clustered indexes can exist.

Example

```
Index on

Name

Email

Phone Number
```

All can exist together.

---

## Analogy

### Clustered Index

Like a dictionary.

Words are stored alphabetically.

---

### Non-Clustered Index

Like the index at the back of a textbook.

The index tells you **where** the topic is, but the book itself isn't arranged by that index.

---

## Comparison

|Feature|Clustered|Non-Clustered|
|---|---|---|
|Physical order|Yes|No|
|Separate structure|No|Yes|
|Number allowed|One|Multiple|
|Stores actual data|Yes|No (stores pointers)|

---

## Interview Keywords

- Physical Order
- B+ Tree
- Pointer
- Lookup
- Primary Key

---

## 30-Second Interview Answer

> A clustered index determines the physical order of data in the table, so only one clustered index is possible. A non-clustered index is stored separately and contains pointers to the actual rows, allowing multiple non-clustered indexes on the same table.