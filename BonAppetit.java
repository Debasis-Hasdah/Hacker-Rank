import java.util.*;

public class BonAppetit {

    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = 0;

        // total bill
        for (int cost : bill) {
            sum += cost;
        }

        // remove item Anna didn't eat
        int actual = (sum - bill.get(k)) / 2;

        if (actual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actual);
        }
    }

    public static void main(String[] args) {

        List<Integer> bill1 = Arrays.asList(3, 10, 2, 9);
        int k1 = 1;
        int b1 = 12;

        List<Integer> bill2 = Arrays.asList(3, 10, 2, 9);
        int k2 = 1;
        int b2 = 7;

        System.out.print("Example 1: ");
        bonAppetit(bill1, k1, b1);

        System.out.print("Example 2: ");
        bonAppetit(bill2, k2, b2);
    }
}