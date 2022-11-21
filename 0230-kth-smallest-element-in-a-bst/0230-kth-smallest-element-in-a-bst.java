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
    int ans=0,count=0;
    public int kthSmallest(TreeNode A, int B) {
        inorder(A,B);
        return ans;
        
    }
    public void inorder(TreeNode A, int B){
        if (A==null) return;
        if(count==B) return;
        inorder(A.left,B);
        count++;
        if(count==B) ans=A.val;
        inorder(A.right,B);
    }
}