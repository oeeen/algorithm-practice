package etc;

import java.util.ArrayList;
import java.util.List;

public class MinSum {
    public int solution(Node roots) {
        int min = Integer.MAX_VALUE;
        List<Node> nodes = new ArrayList<>();
        int sum = 0;

        nodes.add(roots);

        while (!nodes.isEmpty()) {
            Node node = nodes.remove(0);
            sum = node.value;

            if (node.left == null && node.right == null) {
                if (min > sum) min = sum;
                continue;
            }

            if (node.left != null) {
                nodes.add(new Node(sum + node.left.value, node.left.left, node.left.right));
            }
            if (node.right != null) {
                nodes.add(new Node(sum + node.right.value, node.right.left, node.right.right));
            }
        }

        return min;
    }

    public static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
