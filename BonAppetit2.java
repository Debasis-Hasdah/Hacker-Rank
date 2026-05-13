public class BonAppetit2 {

    public static void main(String[] args) {

        // Hardcoded input
        int[] bill = {3, 10, 2, 9};

        int k = 1;   // Anna didn't eat item at index 1
        int b = 12;  // Amount Brian charged Anna

        int total = 0;

        // Calculate total except k index
        for (int i = 0; i < bill.length; i++) {

            if (i != k) {
                total += bill[i];
            }
        }

        // Anna's actual share
        int actualShare = total / 2;

        // Check bill
        if (b == actualShare) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actualShare);
        }
    }
}