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
    ArrayList<Integer> ans = new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        ans.add(root.val);
        inOrder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        inOrder(root);
        int i=0,j=ans.size()-1;
        while(i<j){
            if(ans.get(i)+ans.get(j)>k) j--;
            else if(ans.get(i)+ans.get(j)<k) i++;
            else return true;
        }
        return false;
        
    }
}