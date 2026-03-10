import java.util.*;

public class Matrix {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int n = arr.size();
        int primary = 0;
        int secondary = 0;

        for(int i = 0; i < n; i++){
            primary += arr.get(i).get(i);
            secondary += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primary - secondary);
    }

    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();

        matrix.add(Arrays.asList(11,2,4));
        matrix.add(Arrays.asList(4,5,6));
        matrix.add(Arrays.asList(10,8,-12));

        System.out.println(diagonalDifference(matrix));
    }
}