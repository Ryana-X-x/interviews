## HTTP

- HyperText Transfer Protocol
- Data is sent in **plain text**
- No encryption
- Port **80**
- Vulnerable to eavesdropping and modification

---

## HTTPS

- HyperText Transfer Protocol Secure
- Uses **TLS (Transport Layer Security)** for encryption
- Port **443**
- Prevents attackers from reading or modifying transmitted data
- Verifies the server's identity using a digital certificate

---

## Security Provided by HTTPS

### Authentication

Confirms you're communicating with the legitimate server.

---

### Integrity

Ensures data isn't modified during transmission.

---

### Confidentiality

Encrypts the communication so others can't read it.

---

## Comparison

|Feature|HTTP|HTTPS|
|---|---|---|
|Encryption|❌ No|✅ Yes (TLS)|
|Port|80|443|
|Authentication|❌ No|✅ Yes|
|Data Integrity|❌ No|✅ Yes|
|Confidentiality|❌ No|✅ Yes|

---

## Interview Keywords

- TLS
- SSL (legacy term)
- Encryption
- Digital Certificate
- Authentication
- Integrity
- Confidentiality

---

## 30-Second Interview Answer

> HTTP transmits data in plain text over port 80 and provides no security. HTTPS uses TLS encryption over port 443, ensuring confidentiality through encryption, integrity by detecting tampering, and authentication through digital certificates, making communication secure.