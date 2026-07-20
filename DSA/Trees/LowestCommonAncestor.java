import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null)
            return null;

        if (root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null)
            return right;

        if (right == null)
            return left;

        return root;
    }

    public static void main(String[] args) {

        /*
                  3
                /   \
               5     1
              / \   / \
             6   2 0   8
                / \
               7   4
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Example 1
        TreeNode p = root.left;          // Node 5
        TreeNode q = root.right;         // Node 1

        TreeNode lca = lowestCommonAncestor(root, p, q);

        System.out.println("LCA of " + p.val + " and " + q.val + " = " + lca.val);

        // Example 2
        p = root.left;                   // Node 5
        q = root.left.right.right;       // Node 4

        lca = lowestCommonAncestor(root, p, q);

        System.out.println("LCA of " + p.val + " and " + q.val + " = " + lca.val);
    }
}