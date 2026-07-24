## Definition

A **transaction** is a sequence of one or more database operations treated as a **single logical unit of work**.

A transaction has only two possible outcomes:

- ✅ **COMMIT** → All operations succeed and changes are permanently saved.
- ❌ **ROLLBACK** → If any operation fails, all previous changes are undone.

---

## Example

### Bank Transfer

Suppose you transfer **₹1000** from Account A to Account B.

Steps:

```
1. Debit ₹1000 from Account A
2. Credit ₹1000 to Account B
```

Without transactions:

```
Debit A ✅

System crashes ❌

Credit B never happens
```

Result:

```
Account A lost ₹1000

Account B received nothing
```

Database becomes inconsistent.

---

### With Transaction

```
BEGIN TRANSACTION

Debit ₹1000 from A

Credit ₹1000 to B

COMMIT
```

If any step fails:

```
ROLLBACK
```

Database returns to its previous state.

---

## Transaction Commands

### BEGIN

Starts a transaction.

---

### COMMIT

Permanently saves all changes.

---

### ROLLBACK

Cancels all operations performed during the transaction.

---

## Properties of a Transaction

Every transaction should satisfy the **ACID** properties:

- Atomicity
- Consistency
- Isolation
- Durability

---

## Interview Keywords

- COMMIT
- ROLLBACK
- BEGIN TRANSACTION
- ACID
- Data Integrity
- Consistency

---

## 30-Second Interview Answer

> A transaction is a sequence of database operations treated as a single logical unit of work. Either all operations succeed and are committed, or if any operation fails, the entire transaction is rolled back. Transactions ensure data integrity by following the ACID properties.