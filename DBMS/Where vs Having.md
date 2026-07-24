## WHERE

Filters **rows** before grouping.

Executed before:

```
GROUP BY
```

Cannot use aggregate functions directly.

### Example

```
SELECT *
FROM Employee
WHERE salary > 50000;
```

---

## HAVING

Filters **groups** after `GROUP BY`.

Usually used with aggregate functions.

### Example

```
SELECT department, COUNT(*)
FROM Employee
GROUP BY department
HAVING COUNT(*) > 5;
```

---

## SQL Execution Order

```
FROM
↓

WHERE
↓

GROUP BY
↓

HAVING
↓

SELECT
↓

ORDER BY
```

---

## Comparison

|Feature|WHERE|HAVING|
|---|---|---|
|Filters|Rows|Groups|
|Executed|Before GROUP BY|After GROUP BY|
|Aggregate Functions|❌ No|✅ Yes|

---

## Interview Keywords

- GROUP BY
- Aggregate Functions
- COUNT()
- SUM()
- SQL Execution Order

---

## 30-Second Interview Answer

> `WHERE` filters individual rows before grouping and cannot directly use aggregate functions. `HAVING` filters grouped results after `GROUP BY` and is commonly used with aggregate functions such as `COUNT()`, `SUM()`, and `AVG()`.