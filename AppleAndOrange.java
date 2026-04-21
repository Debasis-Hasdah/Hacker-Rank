import java.util.*;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b,
                                             int[] apples, int[] oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        // check apples
        for (int d : apples) {
            int position = a + d;
            if (position >= s && position <= t) {
                appleCount++;
            }
        }

        // check oranges
        for (int d : oranges) {
            int position = b + d;
            if (position >= s && position <= t) {
                orangeCount++;
            }
        }

        System.out.println("Apples on house: " + appleCount);
        System.out.println("Oranges on house: " + orangeCount);
    }

    public static void main(String[] args) {

        int s = 7, t = 11;
        int a = 5, b = 15;

        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}