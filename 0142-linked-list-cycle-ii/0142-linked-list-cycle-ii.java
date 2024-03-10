/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public static ListNode getStartNode(ListNode head, ListNode slowPtr){
        ListNode temp = head;
        while(slowPtr != temp){
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr){
                return getStartNode(head,slowPtr);
            }
        }
        return null;
    }
}