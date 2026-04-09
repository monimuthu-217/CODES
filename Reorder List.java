class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (second != null) {
            ListNode nextRef = second.next;
            second.next = prev;
            prev = second;
            second = nextRef;
        }
        ListNode first = head;
        ListNode secondHalf = prev;
        while (secondHalf != null) {
            ListNode t1 = first.next;
            ListNode t2 = secondHalf.next;
            first.next = secondHalf;
            secondHalf.next = t1;
            first = t1;
            secondHalf = t2;
        }
    }
}
