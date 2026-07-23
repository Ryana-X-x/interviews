- ACID properties ensure that database transactions are reliable and maintain data integrity.

## A -- Atomicity 
**Definition**
A transaction is **all-or-nothing**.

Either every operation succeeds, or the entire transaction is rolled back.

### Example

Bank Transfer

```
A → B ₹1000

Deduct ₹1000 from A ✅
Add ₹1000 to B ❌ (System crashes)
```

Without Atomicity:

```
A loses ₹1000
B receives nothing
```

With Atomicity:

```
Transaction Rollback

A gets ₹1000 back
```

---
## C -- Consistency
**Definition**
A transaction always moves the database from **one valid state to another valid state**.

Database rules (constraints) are never violated.

### Example

Suppose:

```
Account Balance >= 0
```

A transaction should never leave the balance as

```
-500
```

---
## I -- Isolation
**Definition**
Multiple transactions should not interfere with each other.

Each transaction behaves as if it is running alone.

### Example

Two users booking the **last available train seat**.

Without Isolation:

```
User A books seat ✅

User B also books same seat ✅
```

With Isolation:

```
Only one booking succeeds.
```

---
## D -- Durability 
**Definition**
Once a transaction is committed, the changes are **permanent**, even if the system crashes.

### Example

```
Money transferred

Commit Successful

↓

Power Failure
```

After restarting:

```
Money is still transferred.
```

---
## Interview Keywords

- Transaction
- Commit
- Rollback
- Data Integrity
- Concurrent Transactions

---

## 30-Second Interview Answer

> ACID properties ensure reliable database transactions. **Atomicity** guarantees all-or-nothing execution, **Consistency** keeps the database in a valid state, **Isolation** prevents concurrent transactions from interfering with each other, and **Durability** ensures committed data is permanently stored even after a system failure.