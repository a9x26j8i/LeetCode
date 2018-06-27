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
        //don't necessarily manipulate listnode
        //you can change value & change "next" to implement remove.
        node.val = node.next.val;
        node.next = node.next.next;
    }
}