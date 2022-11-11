/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode head=node;
        ListNode temp=node.next;
        ListNode prev=null;
        
        while(temp!=null){
            head.val=temp.val;
            prev=head;
            head=head.next;
            temp=temp.next;
            
        }
        prev.next=null;
        
    }
}