Think of it as array vs chain of nodes:
- **ArrayList**: contiguous memory -> O(1) random access via index math, but inserting/removing in the middle means shifting elements -> O(n)
- **LinkedList**: each node points to next/prev -> O(1) insert/delete once you have reference to the node, but O(n) to get to a random index since you must walk the list.
- **Practical rule interviewers want**: ArrayList by default, LinkedList only when you're doing lots of insertion/deletions at known positions(like implementing a queue/dequeue).