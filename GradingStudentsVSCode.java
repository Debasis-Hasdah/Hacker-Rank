import java.util.*;

public class GradingStudentsVSCode {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        for (int grade : grades) {

            if (grade >= 38 && grade % 5 >= 3) {
                grade += (5 - grade % 5);
            }

            result.add(grade);
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> grades = Arrays.asList(73, 67, 38, 33);

        List<Integer> result = gradingStudents(grades);

        System.out.println("Original: " + grades);
        System.out.println("Rounded : " + result);
    }
}