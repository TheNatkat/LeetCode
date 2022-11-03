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
    public boolean isValidBST(TreeNode root) {
        
        
        
         return isbst(root,Long.MIN_VALUE,Long.MAX_VALUE);
        }

    public boolean isbst(TreeNode A,long min,long max){
    if(A==null) return true;
    if(A.val>=max || A.val<=min) return false;
    return isbst(A.left,min,A.val) && isbst(A.right,A.val,max);
}
    
}