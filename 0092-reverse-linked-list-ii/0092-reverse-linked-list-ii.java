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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode start=head,preStart=head,end=head,preEnd=head;
        int count=1;
        while(count<=right){
            if(count<left){
                preStart=start;
                start=start.next;
            }
            preEnd=end;
            end=end.next;
            count++;
        }
        
        ListNode prev=null;
        ListNode curr=start;
        ListNode Next=null;
        
        while(curr!=end){
            Next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        
        preStart.next=prev;
        if(left==1) head=prev;
        start.next=end;
        return head;
        
    }
}