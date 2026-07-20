cases:
- curr = a || curr = b                         // return curr
- a -> left subtree, b -> right subtree       // return root 
- both a & b in any one subtree           
- None of the in any subtree
---


Github: https://github.com/Ryana-X-x/interviews/blob/master/DSA/Trees/LowestCommonAncestor.java

Traversal: root left right

Time Complexity: O(n)
Space Complexity: O(h)