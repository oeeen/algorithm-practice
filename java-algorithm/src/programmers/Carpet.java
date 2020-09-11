package programmers;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int width = 0; // >= height
        int height = 0;

        int middle = (brown / 2) + 2;

        for (int i = 1; i < middle; i++) {
            height = i;
            width = middle - i;
            if ((width - 2) * (height - 2) == yellow) break;
        }

        return new int[]{width, height};
    }
}