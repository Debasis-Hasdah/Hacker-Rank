public class Staircase {

    public static void main(String[] args) {

        int n = 6; // change value to test

        staircase(n);
    }

    public static void staircase(int n) {

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print hashes
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}