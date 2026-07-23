## Definition

A context switch occurs when the CPU stops executing one process or thread and starts executing another.

The operating system performs the switch.

---

## Steps

### 1. Save Current State

Store:

- Program Counter (PC)
- CPU Registers
- Stack Pointer
- Process State

into the current process's PCB (Process Control Block).

---

### 2. Load Next Process

Restore the saved state of the next process from its PCB.

---

### 3. Resume Execution

The CPU continues execution from where the next process was previously paused.

---

## Why is it Needed?

Allows multitasking.

Example:

```
Chrome

↓

VS Code

↓

Spotify

↓

Terminal
```

One CPU rapidly switches between them, creating the illusion that they run simultaneously.

---

## Disadvantage

Context switching is **overhead**.

During a context switch:

- No useful application work is performed.
- CPU spends time saving and restoring state.

Too many context switches reduce performance.

---

## Interview Keywords

- Scheduler
- PCB (Process Control Block)
- CPU Registers
- Program Counter
- Overhead
- Multitasking

---

## 30-Second Interview Answer

> A context switch is the process of switching the CPU from one process or thread to another. The operating system saves the current process's execution state in its PCB, restores the next process's state, and resumes execution. Although necessary for multitasking, excessive context switching introduces overhead and reduces performance.