import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args) {

        // Hardcoded test cases
        String[] patterns = {
            "([A-Z])(.+)",
            "[AZ[a-z](a-z)",
            "batcatpat(nat"
        };

        for (String pattern : patterns) {
            try {
                Pattern.compile(pattern);
                System.out.println(pattern + " -> Valid");
            } catch (PatternSyntaxException e) {
                System.out.println(pattern + " -> Invalid");
            }
        }
    }
}