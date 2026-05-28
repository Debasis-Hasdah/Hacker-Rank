public class JavaStringCompare {

    public static void main(String[] args) {

        String s = "welcometojavaworld";
        int k = 3;

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        
        for (int i = 0; i <= s.length() - k; i++) {

            String current = s.substring(i, i + k);

           
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

           
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        // Output
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}