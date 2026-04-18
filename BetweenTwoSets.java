import java.util.*;

public class BetweenTwoSets {

    // function to find GCD
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // function to find LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        // Step 1: LCM of array a
        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }

        // Step 2: GCD of array b
        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }

        // Step 3: count multiples of LCM that divide GCD
        int count = 0;

        for (int i = lcmA; i <= gcdB; i += lcmA) {
            if (gcdB % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2, 6);
        List<Integer> b = Arrays.asList(24, 36);

        int result = getTotalX(a, b);

        System.out.println("Total numbers between sets: " + result);
    }
}