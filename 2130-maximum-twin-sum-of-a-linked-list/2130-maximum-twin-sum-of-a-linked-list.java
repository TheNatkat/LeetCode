/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode slow= head, fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        st.push(slow.val);
        int ans=0;
        while(slow.next!=null && !st.isEmpty()){
            slow=slow.next;
            int num=st.peek();
            ans=Math.max(ans,slow.val+num);
            st.pop();
            
        }
        return ans;
        
        
        
        
        
    }
}