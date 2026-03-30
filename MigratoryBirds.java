import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {

        int[] count = new int[6]; // index 1 to 5


        for (int bird : arr) {
            count[bird]++;
        }

        int max = 0;
        int result = 0;

        
        for (int i = 1; i <= 5; i++) {
            if (count[i] > max) {
                max = count[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);

        int ans = migratoryBirds(arr);

        System.out.println("Most common bird type: " + ans);
    }
}