import leetcode.RemoveDuplicate;


public class AlgorithmMain {
    public static void main(String[] args) {
        RemoveDuplicate sol = new RemoveDuplicate();

        System.out.println(sol.deleteDuplicates(new RemoveDuplicate.ListNode(1, new RemoveDuplicate.ListNode(1, new RemoveDuplicate.ListNode(2)))));
    }
}