/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
            ListNode b=headB;
            
            while(a!=b){
                a= (a!=null)? a.next : headB;
                b= (b!=null)? b.next : headA;
            }
            
            return b;
    }
}
//         ArrayList<Integer> a = new ArrayList<Integer>();
//         ArrayList<Integer> b = new ArrayList<Integer>();
        // if(headA==null || headA.next==null){
        //     return null;
        // }
        // if(headB==null || headB.next==null){
        //     return null;
        // }
        // if(headA.next==headB.next) return headA;
        // ListNode temp= headA;
        // int al=1;
        // while(temp!=null){
        //     temp=temp.next;
        //     al++;
        // }
        // temp= headB;
        // int bl=1;
        // while(temp!=null){
        //     bl++;
        //     temp=temp.next;
//         int length_a = a.size();
//         int length_b = b.size();
        
//         int length=Math.max(length_a,length_b);
//         int ans=0;
        
//         for(int i=length-1; i>0; i--){
//             if(a.get(i)!=b.get(i)){
//                 ans=a.get(i);
//                 break;
//             }
//         }
//         if(ans+2==length){
//             return null;
//         }
        
//         temp= headB;
//         while(temp.val!=ans){
//             temp=temp.next;
//         }
//         return temp.next;
//             int diff= Math.abs(al-bl);
//             if(al>bl){
//                 while(diff!=0){
//                     headA=headA.next;
//                     diff--;
//                 }
//             }else{
//                 while(diff!=0){
//                     headB=headB.next;
//                     diff--;
//                 }
                
//             }
//             ListNode ans=null;
            
//             while(headA!=null && headB!=null){
//                 if(headA.next==headB.next) return headA.next;
//                 else if(headA==headB.next) return headB.next;
//                 else if(headA.next==headB) return headB;
//                 else if(headA==headB) return headA;
//                 headA=headA.next;
//                 headB=headB.next;
//             }
//             return null;
            
        

