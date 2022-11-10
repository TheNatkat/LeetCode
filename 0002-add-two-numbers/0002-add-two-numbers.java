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
    // public int getnumber(ListNode head){
    //     int num=0;
    //     int i=1;
    //     while(head!=null){
    //         int temp=head.val*i;
    //         i *= 10;
    //         num += temp;
    //         head=head.next;
    //     }
    //     return num;
    // }
    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     int num1,num2;
    //     int x= getnumber(l1);
    //     int y= getnumber(l2);
    //     int sum=x+y;
    //     ListNode ans = new ListNode(0);
    //     if(sum==0) return ans;
    //     ListNode temp = ans;
    //     while(sum!=0){
    //     temp.next = new ListNode(sum % 10);
    //     sum=sum/10;
    //     temp = temp.next;
    //     }
    //     return ans.next;
    // }
    
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int carry=0,sum=0;
         ListNode ans = new ListNode(0);
         ListNode curr= ans;
         while(l1!=null || l2!=null || carry==1){
             sum=0;
             if(l1!=null){
                 sum=sum+l1.val;
                 l1=l1.next;
             }
             if(l2!=null){
                 sum=sum+l2.val;
                 l2=l2.next;
             }
             sum=sum+carry;
             carry=sum/10;
             curr.next= new ListNode(sum%10);
             curr= curr.next;
         }
         return ans.next;
     }
    
}