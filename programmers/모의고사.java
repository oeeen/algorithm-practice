import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] answerCount = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i%5]) answerCount[0]++;
            if (answers[i] == person2[i%8]) answerCount[1]++;
            if (answers[i] == person3[i%10]) answerCount[2]++;
        }
        
        int maxValue = Math.max(Math.max(answerCount[0], answerCount[1]), answerCount[2]);
        
        for (int i = 0; i < 3; i++) {
            if (maxValue == answerCount[i]) answer.add(i+1);
        }
        
        int[] ans = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
        return ans;
    }
}