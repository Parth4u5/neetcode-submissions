/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    //this slow fast pointers approach
    public boolean hasCycle(ListNode head) {
        //slow pointer moves 1 index
        ListNode slowPointer = head;
        //fast pointer moves 2 index
        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            // here the concept is so straight when slow poiner moves 1 index and fast moves 2 index both eventually gonna meet at the same point because of uneven movement in the both pointers
            if(fastPointer == slowPointer){
                return true;
            }
        }
        return false;
    }
}
