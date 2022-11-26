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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack <>();
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        TreeNode main = root;
        while(main!=null || !st.isEmpty()){
            while(main!=null){
                st.push(main);
                ans.add(main.val);
                main=main.right;
            }
            
            main=st.pop().left;
            
            
        }
        Collections.reverse(ans);
        return ans;
    }
}