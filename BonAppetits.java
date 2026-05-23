public class BonAppetits {

    public static void main(String[] args) {

        // Food bill array
        int[] bill = {3, 10, 2, 9};

        // Anna didn't eat item at index 1
        int k = 1;

        // Amount Brian charged Anna
        int b = 12;

        int total = 0;

        // Calculate total excluding k index
        for (int i = 0; i < bill.length; i++) {

            if (i != k) {
                total += bill[i];
            }
        }

        // Anna's actual share
        int actualShare = total / 2;

        // Compare with charged amount
        if (b == actualShare) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println("Refund Amount: " + (b - actualShare));
        }
    }
}