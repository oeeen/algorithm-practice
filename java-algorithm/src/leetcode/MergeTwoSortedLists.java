package leetcode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode curr = answer;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            }

            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }

        if (l2 != null) {
            curr.next = l2;
        }

        return answer.next;
    }

    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
