## TCP (Transmission Control Protocol)

TCP is a **connection-oriented** protocol.

Before sending data:

```
Client

↓

Connection Established

↓

Data Transfer
```

---

### Features

- Reliable
- Connection-oriented
- Ordered delivery
- Error checking
- Retransmits lost packets
- Slower due to extra overhead

---

### Common Uses

- Web Browsing (HTTP/HTTPS)
- Email
- File Transfer (FTP)
- Banking Applications

---

## UDP (User Datagram Protocol)

UDP is **connectionless**.

Data is sent immediately.

No connection setup.

---

### Features

- Faster
- Connectionless
- No delivery guarantee
- No retransmission
- No ordering guarantee
- Lower overhead

---

### Common Uses

- Online Gaming
- Video Streaming
- Voice Calls (VoIP)
- DNS

---

## Comparison

|Feature|TCP|UDP|
|---|---|---|
|Connection|Connection-Oriented|Connectionless|
|Reliability|✅ Yes|❌ No|
|Ordered Delivery|✅ Yes|❌ No|
|Error Recovery|✅ Yes|❌ No|
|Speed|Slower|Faster|
|Typical Use|Banking, HTTP, FTP|Gaming, Streaming, DNS|

---

## When to Use Which?

### TCP

When **accuracy is more important than speed**.

Example:

```
Online Banking
```

You cannot lose money because a packet was dropped.

---

### UDP

When **speed is more important than reliability**.

Example:

```
Live Video Streaming
```

Dropping one frame is acceptable.

Waiting for retransmission is not.

---

## Interview Keywords

- Connection-Oriented
- Connectionless
- Three-Way Handshake
- Reliability
- Ordered Delivery
- Packet Loss

---

## 30-Second Interview Answer

> TCP is a reliable, connection-oriented protocol that guarantees ordered delivery and error recovery, making it suitable for applications like banking, file transfer, and web browsing. UDP is a connectionless protocol that prioritizes speed over reliability, making it ideal for gaming, streaming, VoIP, and DNS.