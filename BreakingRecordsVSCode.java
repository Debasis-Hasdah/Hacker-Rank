import java.util.*;

public class BreakingRecordsVSCode {

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

        List<Integer> scores1 = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> scores2 = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);

        System.out.println("Example 1: " + breakingRecords(scores1));
        System.out.println("Example 2: " + breakingRecords(scores2));
    }
}