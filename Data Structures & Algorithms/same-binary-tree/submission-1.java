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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> qu= new LinkedList<>();
        qu.add(p);
        qu.add(q);
        while(!qu.isEmpty()){ //loop till queue is non empty
         TreeNode curr1=qu.remove();
         TreeNode curr2=qu.remove();

         if(curr1==null&&curr2==null){
            continue;
            }
         if(curr1==null||curr2==null || curr1.val!=curr2.val){
            return false;
         }

         //add other nodes 
         qu.add(curr1.left);
         qu.add(curr2.left);
         qu.add(curr1.right);
         qu.add(curr2.right);
         }
         return true;
    }
}
