**Process vs Thread** — the key distinguishing idea is **memory ownership**.

- A **process** has its own isolated address space (code, heap, stack, data segment). Creating one is expensive (OS has to set up a full memory space), and processes can't directly touch each other's memory — they need IPC (pipes, sockets, shared memory) to communicate.
- A **thread** lives _inside_ a process and shares its heap and code with other threads in the same process — but each thread gets its **own stack** and **own program counter** (so it can execute independently). This sharing is exactly what makes threads lightweight to create/switch between, but also what makes them dangerous — two threads can race on the same heap variable.

That's the real followup interviewers want: "if threads share memory, how do you avoid race conditions?" → locks, synchronized blocks, atomic variables, etc.