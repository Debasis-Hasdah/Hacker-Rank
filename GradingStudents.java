import java.util.*;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        for (int grade : grades) {

            if (grade >= 31) {

                int nextMultiple = ((grade / 5) + 1) * 5;

                if (nextMultiple - grade < 3) {
                    grade = nextMultiple;
                }
            }

            result.add(grade);
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> grades = Arrays.asList(73, 67, 38, 33);

        List<Integer> result = gradingStudents(grades);

        System.out.println("Original value: " + grades);
        System.out.println("Rounded value: " + result);
    }
}