/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(99);
        ListNode node = head;
        int carry = 0;
        
        node.val = (l1.val + l2.val + carry)%10;
        if(l1.val + l2.val + carry>9){
            carry = 1;
        }else{
            carry = 0;
        }
        l1 = l1.next;
        l2 = l2.next;

        while(l1!=null || l2!=null || carry==1){
            if(l1==null && l2==null){
                //Crucial Current node should be the end object.
                node.next = new ListNode(carry);
                carry = 0;
                continue;
            } 
            if(l1==null){
                 node.next = new ListNode((l2.val+carry)%10);
                 node = node.next;
                 if(l2.val+carry>9){
                     carry=1;
                 }else{
                     carry=0;
                 }
                 l2 = l2.next;
                 continue;
             }
            if(l2==null){
                node.next = new ListNode((l1.val+carry)%10);
                node = node.next;
                if(l1.val+carry>9){
                    carry=1;
                }else{
                    carry=0;
                }
                l1 = l1.next;
                continue;
            }
            
            node.next = new ListNode((l1.val+l2.val+carry)%10);
            node = node.next;
            if(l1.val+l2.val+carry>9)
                carry=1;
            else
                carry=0;
            l1 = l1.next; l2 = l2.next;
            continue;
        }
        return head;
    }
}