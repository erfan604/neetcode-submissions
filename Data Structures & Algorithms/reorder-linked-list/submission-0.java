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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        // define slow and fast ptrs
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //break the list
        prev.next = null;

        //reverse the last half of list
        ListNode p1 = head;
        ListNode p2 = reverse(slow);

        //reorder the list
        while (p1 != null && p2 != null){
            ListNode next1 = p1.next;
            ListNode next2 = p2.next;
            p1.next = p2;
            p2.next = next1 == null ? next2 : next1;

            p1 = next1;
            p2 = next2;

        }
    }
        private ListNode reverse(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;

    }
}
