(**SYN** (short for _Synchronize_) is ==the flag used to initiate a connection==.)
```java

Client                     Server
  | ---- SYN (seq=x) ---->  |
  | <-- SYN-ACK (seq=y,     |
  |      ack=x+1) --------  |
  | ---- ACK (ack=y+1) -->  |
```


Why three steps and not two? Because TCP is **bidirectional** — both sides need to prove they can send _and_ receive.

1. Client sends SYN with an initial sequence number `x` — "I want to talk, here's where my byte-numbering starts."
2. Server responds with SYN-ACK — acknowledges the client's SYN (`ack = x+1`) _and_ sends its own SYN with sequence number `y` — "I heard you, and here's where my numbering starts."
3. Client sends ACK (`ack = y+1`) — confirms it received the server's SYN.

If you stopped at 2 steps, the server would never get confirmation that the client actually received its SYN — the server's sequence number wouldn't be acknowledged, and it couldn't be sure the client is really there and ready. Three steps make it symmetric proof of reachability in both directions, and it's how each side agrees on the starting sequence numbers used to track byte order and detect lost/duplicate packets later.