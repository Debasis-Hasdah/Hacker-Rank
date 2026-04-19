import java.util.*;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int maxScore = scores.get(0);
        int minScore = scores.get(0);

        int maxCount = 0;
        int minCount = 0;

        for (int i = 1; i < scores.size(); i++) {

            int score = scores.get(i);

            if (score > maxScore) {
                maxScore = score;
                maxCount++;
            } 
            else if (score < minScore) {
                minScore = score;
                minCount++;
            }
        }

        return Arrays.asList(maxCount, minCount);
    }

    public static void main(String[] args) {

        List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);

        List<Integer> result = breakingRecords(scores);

        System.out.println("Result: " + result);
    }
}