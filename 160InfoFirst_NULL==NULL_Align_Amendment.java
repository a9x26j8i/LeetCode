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
    //not pure math, take advantage of the target attribute 
    //A.K.A translate result into attributes
    //
    //INFO FIRST*                          : get info as MUCH as possible FIRST !!!!
    //TRANSLATE TARGET*                    : translate target into attributes first!  
    //NULL == NULL
    
    //1. two-pointers? NO!
    //      amend after more info? YES!
    //
    //2. translate target into attributes 
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null| headB == null){
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        int lengthAC = 0, lengthBC = 0;
        int diff;
        //calculate length AC
        lengthAC = 1;
        while(curA.next != null){
            curA = curA.next;
            ++lengthAC;
        }
        System.out.println("AC:" + lengthAC);
        //calculate length BC
        lengthBC = 1;
        while(curB.next != null){
            curB = curB.next;
            ++lengthBC;
        }
        System.out.println("BC:" + lengthAC);
        //refresh cursors
        curA = headA;
        curB = headB;
        
        //calculate difference
        diff = lengthAC - lengthBC;
        if(diff > 0){
            while(diff != 0){
                curA = curA.next;
                diff--;
            }
        }else{
            while(diff != 0){
                curB = curB.next;
                diff++;
            }
        }
        /*
        *   NULL == NULL !!!
        */
        //compare
        while(curA != curB){
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
        
    }
}