import java.util.*;

class Result {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {

            if (a.get(i) > b.get(i)) {
                alice++;
            } 
            else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(alice);
        result.add(bob);

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);

        List<Integer> ans = Result.compareTriplets(a, b);

        System.out.println(ans);
    }
}