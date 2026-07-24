## Definition

A REST API is **stateless** if **every request contains all the information required to process it**.

The server does **not** store client session information between requests.

---

## Example

### Stateless

```
GET /users/1

Authorization: Bearer <JWT Token>
```

Everything needed is included in the request.

The server can process it immediately.

---

### Stateful

```
Login

↓

Server stores session

↓

Every future request depends on that session
```

Now the server must remember each client.

---

## Benefits

### Easier Horizontal Scaling

Any server can handle any request.

---

### Better Load Balancing

Requests can be sent to any server.

---

### Simpler Failover

If one server crashes,

another server can immediately continue processing requests.

---

### No Server-Side Session Storage

Lower memory usage.

Simpler architecture.

---

## Why JWT Works Well

JWT stores user information inside the token.

Each request sends:

```
Authorization: Bearer <token>
```

No server session required.

---

## Interview Keywords

- Stateless
- REST
- JWT
- Horizontal Scaling
- Load Balancer
- Sessionless Authentication

---

## 30-Second Interview Answer

> REST APIs should be stateless, meaning every request contains all the information required to process it. The server does not store client session data, which improves scalability, simplifies load balancing and failover, and allows any server instance to process any request independently.