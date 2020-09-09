import leetcode.AddTwoNumbers;

public class AlgorithmMain {
    public static void main(String[] args) {
        AddTwoNumbers sol = new AddTwoNumbers();


        AddTwoNumbers.ListNode l1Third = new AddTwoNumbers.ListNode(3);
        AddTwoNumbers.ListNode l1Second = new AddTwoNumbers.ListNode(4, l1Third);
        AddTwoNumbers.ListNode l1First = new AddTwoNumbers.ListNode(2, l1Second);

        AddTwoNumbers.ListNode l2Third = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode l2Second = new AddTwoNumbers.ListNode(6, l2Third);
        AddTwoNumbers.ListNode l2First = new AddTwoNumbers.ListNode(5, l2Second);
        System.out.println(sol.addTwoNumbers(l1First, l2First));
    }
}