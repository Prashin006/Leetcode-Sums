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
import java.util.HashMap;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA != null){
            map.put(currA,currA.val);
            currA = currA.next;
        }
        while(currB != null){
            if(map.containsKey(currB)){
                return currB;
            }
            currB = currB.next;
        }
        return null;
    }
}