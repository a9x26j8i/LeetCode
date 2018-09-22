/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //Memo
    // public boolean isPalindrome(ListNode head) {
    //     if(head == null){
    //         return true;
    //     }
    //     ArrayList<Integer> array = new ArrayList<>();
    //     ListNode node = head;
    //     while(node != null){
    //         array.add(node.val);
    //         node = node.next;
    //     }
    //     node = head;
    //     for(int i = array.size()-1; i>=0; i--){
    //         if(array.get(i) != node.val){
    //             return false;
    //         }
    //         node = node.next;
    //     }
    //     return true;
    // }
    
    //Reverse 
    public boolean isPalindrome(ListNode head){
        //if size == 1 
        if(head == null || head.next == null){
             return true;
         }
        
        ListNode slow = head, 
                 fast = head.next;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = slow.next;
        System.out.println(slow.val);
        ListNode rev = reverse(slow);
        while(head != slow){
            if(rev.val != head.val){
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
        
    }
    //main pointer: head & prev, next is for memorizing
    private ListNode reverse(ListNode head){
        ListNode next = head,
                 prev  = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}