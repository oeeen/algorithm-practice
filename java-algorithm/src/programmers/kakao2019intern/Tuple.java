package programmers.kakao2019intern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tuple {
    public int[] solution(String s) {
        s = s.replace("{", "");
        s = s.replace("}", "");

        String[] split = s.split(",");
        Map<Integer, Integer> frequency = new HashMap<>();
        for (String strNum : split) {
            int number = Integer.parseInt(strNum);
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(frequency.entrySet());

        entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int[] answer = new int[entries.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = entries.get(i).getKey();
        }
        return answer;
    }
}
