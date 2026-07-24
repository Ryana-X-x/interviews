## What the Interviewer is Evaluating

- Ownership
- Honesty
- Debugging skills
- Root Cause Analysis
- Learning mindset
- Preventive measures

---

## Good Answer Structure (STAR Method)

### Situation

Briefly explain the project and the bug.

---

### Task

What were you trying to implement?

---

### Action

Explain:

- How you discovered the bug.
- How you debugged it.
- What the root cause was.
- How you fixed it.

---

### Result

- What was the outcome?
- Was the issue resolved?
- Did users or the team benefit?

---

### Learning

Most important part.

Explain how you prevented similar bugs in the future.

Examples:

- Added unit tests.
- Improved code reviews.
- Added logging.
- Validated inputs.
- Wrote better documentation.

---

## Example Answer

> During a backend project, I introduced a bug that caused duplicate database records because an API endpoint could be called multiple times. After reproducing the issue locally, I analyzed the logs and found that the endpoint wasn't idempotent. I fixed it by adding proper validation and a unique database constraint. I also added automated tests for duplicate requests. The experience taught me to think about edge cases early and strengthened my debugging and testing practices.