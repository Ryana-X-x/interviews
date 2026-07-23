## Problem

A user clicks the **Pay** button multiple times.

```
Request 1
Request 2
Request 3
```

Without protection:

```
₹100

↓

₹300 charged
```

---

## Solution 1 – Idempotency Key ⭐ (Preferred)

The client sends a unique key with every payment request.

Example:

```
Idempotency-Key: abc123
```

If the same key is received again:

- Do **not** process the payment again.
- Return the previously stored response.

---

## Solution 2 – Unique Database Constraint

Store:

```
payment_id
```

or

```
transaction_id
```

as **UNIQUE**.

Duplicate inserts fail automatically.

---

## Solution 3 – Transaction Management

Wrap payment logic inside a database transaction.

If something fails:

```
ROLLBACK
```

instead of partially processing the payment.

---

## Solution 4 – Distributed Locking

Useful in distributed systems with multiple application servers.

Only one server can process a payment for a given key at a time.

Common tools:

- Redis Locks
- ZooKeeper

---

## Solution 5 – Request Deduplication

Store processed request IDs.

If the same request arrives again:

```
Already Processed

↓

Return previous response
```

---

## Retry-Safe API Design

Clients should be able to retry failed requests without creating duplicate payments.

This is known as an **Idempotent API**.

---

## Interview Keywords

- Idempotency Key
- Database Constraints
- Transactions
- Distributed Lock
- Retry-Safe APIs
- Duplicate Request Prevention

---

## 45-Second Interview Answer

> I would make the payment API idempotent by using an idempotency key. The client sends a unique key with each payment request, and if the same key is received again, the server returns the previous response instead of processing the payment again. I would also enforce unique database constraints, use transactions for consistency, and use distributed locking if multiple application instances can process the same request concurrently.