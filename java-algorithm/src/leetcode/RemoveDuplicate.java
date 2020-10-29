package leetcode;

public class RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode answer = new ListNode(head.val);
        ListNode curr = answer;
        int previousValue = head.val;

        while (head != null) {
            if (previousValue != head.val) {
                curr.next = new ListNode(head.val);
                curr = curr.next;
                previousValue = head.val;
            }
            head = head.next;
        }

        return answer;
    }

    public static class ListNode {
        int val;
        ListNode next;

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
