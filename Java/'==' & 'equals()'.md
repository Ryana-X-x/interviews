## ==
- compares references for objects
- compares values for primitives

## eqauls()
- compares logical/content equality
- overridden by classes like String

```java
`String a = new String("hi");`
`String b = new String("hi");`
`System.out.println(a == b);      // false — different objects in memory`
`System.out.println(a.equals(b)); // true — same content```
```

`==` for objects checks "are these the same object in memory," `equals()` checks "do these represent the same value." For primitives, `==` just compares values since there's no object identity to speak of.

**Follow-up trap interviewers like:** `String a = "hi"; String b = "hi"; a == b` is actually **true** because of the string pool (both point to the same interned literal). Good to mention — shows depth.