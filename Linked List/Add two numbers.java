/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
class Solution {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode res = new ListNode(0);
        ListNode head = res;
        
        int rem = 0;
        
        while(l1!=null || l2!=null || rem!=0){
        
             if(l1!=null){
                 rem += l1.val;
                 l1 = l1.next;
             }
            
            if(l2 !=null){
                rem += l2.val;
                l2 = l2.next;
            }
            
            ListNode cur = new ListNode(rem%10);
            rem /= 10;
            
            res.next = cur;
            
        }
        
        return head.next;
    }
}

*/

class Solution{
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode p, dummy = new ListNode(0);
    p = dummy;
    while (l1 != null || l2 != null || carry != 0) {
        if (l1 != null) {
            carry += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            carry += l2.val;
            l2 = l2.next;
        }
        p.next = new ListNode(carry%10);
        carry /= 10;
        p = p.next;
    }
    return dummy.next;
}
} 
