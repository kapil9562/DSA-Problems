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
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    } 

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // find the middle of the list
        ListNode middle = findMiddle(head);

        // reverse the secondHalf
        ListNode second = reverse(middle.next);

        // split the list into two halves
        middle.next = null;

        ListNode first = head;

        // merge the two halves alternately
        while(second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            second = secondNext;
            first = firstNext;
        }

        
    }
}