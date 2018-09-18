/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    
    ListNode mergeSort(ListNode head){
        //edge cases
        if(head == null) return null;
        //recursion terminal condition
        if(head.next == null){
            return head;
        }
        ListNode slow, //one step per round 
                 fast, //two steps per round
                 rightHead;
        slow = head;
        fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        rightHead = slow.next;
        slow.next = null;
        //divide into two parts
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(rightHead);
        //merge
        return merge(left, right);
    }
    
    
    ListNode merge(ListNode node1, ListNode node2){
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        //compare two lists and append smaller one to ret
        while(node1!=null && node2!= null){
            if(node1.val < node2.val){
                ret.next = node1;
                ret = ret.next;
                node1 = node1.next;
            }else{
                ret.next = node2;
                ret = ret.next;
                node2 = node2.next;
            }
        }
        //concatenate remaining listnodes
        if(node1 == null){
            ret.next = node2;
        }else{
            ret.next = node1;
        }
        head = head.next;
        
        return head;
    }
}