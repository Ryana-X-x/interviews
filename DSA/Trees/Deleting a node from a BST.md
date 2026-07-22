[[Level Order Traversal]]
- Use Recursion
- To delete a node from a BST the safest option is the inorder successor, which is usually the root.right's left most node(end node) where then the root.left is null

### Cases:
```java
if (root == null) return null ;
```

```java
if (key < root) {
	root.left = deleteNode(root.left, key) ;  // deleteNode is the same function
}
```

```java
if (key > root) {
	root.right = deletNode(root.right, key) ;
}
```

```java
else {
	//case 1 no left child
	if (root.left == null) return root.right ;
	
	//case 2 no right child
	if (root.right == null) return root.left ;
	
	//case 3 both left and right child
	TreeNode successor = findMin(root.right) ;
	root.data = successor.data ;
	root.right = deleteNode(root.right, successor.data) ;
}
```

```java
private TreeNode findMin(TreeNode node) {
	while (node != null) {
		node = node.left ;
	}
	return node ;
}
```

![[Pasted image 20260723021723.png]]