/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        return reverse(head, newHead);
        
    }
    //IMPORTANT: method is called by value! all references are copy, simple assignments CAN NOT change real arguments!
    //Although arguments are copied, the objects are REAL!
    private ListNode reverse(ListNode head, ListNode newHead){
        if(head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        newHead = head;
        return reverse(next, newHead);
        
    }
}
