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
    HashMap<Integer,Integer> hm = new HashMap<>();
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        inorder(root.right);
    }
    public int[] findMode(TreeNode root) {
        inorder(root);
        int count=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int x: hm.keySet()){
            int temp=hm.get(x);
            if(temp>count){
                count=temp;
            }
        }
        for(int x: hm.keySet()){
            if(hm.get(x)==count){
                ans.add(x);
            }
        }
        int res[] = new int [ans.size()];
        for (int i = 0; i < ans.size(); ++i) res[i] = ans.get(i);
        return res;
        
    }
}