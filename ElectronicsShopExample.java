import java.util.*;

public class ElectronicsShopExample {

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {

                int sum = keyboards[i] + drives[j];

                if (sum <= b && sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int budget = 10;

        int result = getMoneySpent(keyboards, drives, budget);

        System.out.println("Maximum spend: " + result);
    }
}