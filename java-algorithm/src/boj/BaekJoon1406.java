package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon1406 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        String input = stringTokenizer.nextToken();
        stringTokenizer = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(stringTokenizer.nextToken());

        int length = input.length();

        for (int i = 0; i < length; i++) {
            left.push(String.valueOf(input.charAt(i)));
        }

        for (int i = 0; i < num; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());

            String command = stringTokenizer.nextToken();

            if ("L".equals(command)) {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if ("D".equals(command)) {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if ("B".equals(command)) {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else {
                left.push(stringTokenizer.nextToken());
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        while (!right.isEmpty()) {
            System.out.print(right.pop());
        }
    }
}
