package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp.add(array[j]);
            }
            Collections.sort(temp);
            answers.add(temp.get(commands[i][2] - 1));
            temp.clear();
        }

        int[] answer = new int[answers.size()];

        for (int i = 0; i < answers.size(); i++) {
            answer[i] = answers.get(i);
        }

        return answer;
    }
}
