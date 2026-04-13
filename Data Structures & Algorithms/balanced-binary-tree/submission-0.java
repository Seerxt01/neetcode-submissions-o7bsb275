/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lefth = height(root.left);
        int righth = height(root.right);
        return Math.max(lefth, righth) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        if (Math.abs(leftheight - rightheight) <= 1
            && isBalanced(root.left)
            && isBalanced(root.right)) {
            return true;
        }

        return false;
    }
}
