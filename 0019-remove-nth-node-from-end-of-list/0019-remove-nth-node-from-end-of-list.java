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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }

        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }

        if(size == n) {
            return head.next;
        }

        int i = 1;
        ListNode prev = head;
        while(i < size - n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

        return head;
    }
}