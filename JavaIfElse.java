public class JavaIfElse {

    public static void main(String[] args) {

        checkNumber(3);
        checkNumber(4);
        checkNumber(18);
        checkNumber(24);

    }

    public static void checkNumber(int n) {

        System.out.println("Input: " + n);

        if (n % 2 == 1) {
            System.out.println("Output: Weird");
        } 
        else if (n >= 2 && n <= 5) {
            System.out.println("Output: Not Weird");
        } 
        else if (n >= 6 && n <= 20) {
            System.out.println("Output: Weird");
        } 
        else {
            System.out.println("Output: Not Weird");
        }

        System.out.println();
    }
}