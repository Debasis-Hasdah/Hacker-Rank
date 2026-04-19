import java.util.*;

public class BirthdayBar {

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {

            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);
        int d = 3;
        int m = 2;

        int result = birthday(s, d, m);

        System.out.println("Number of ways: " + result);
    }
}