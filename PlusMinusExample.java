public class PlusMinusExample {

    public static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            } 
            else if (arr[i] < 0) {
                negative++;
            } 
            else {
                zero++;
            }
        }

        double posRatio = (double) positive / n;
        double negRatio = (double) negative / n;
        double zeroRatio = (double) zero / n;

        System.out.printf("%.6f\n", posRatio);
        System.out.printf("%.6f\n", negRatio);
        System.out.printf("%.6f\n", zeroRatio);
    }

    public static void main(String[] args) {

        int[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(arr);
    }
}
