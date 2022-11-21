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
    ArrayList <Integer> ls = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        list(root);
        int ans= ls.get(k-1);
        return ans;
        
    }
    public void list(TreeNode root){
        if(root == null) return;
        list(root.left);
        ls.add(root.val);
        list(root.right);
    }
}