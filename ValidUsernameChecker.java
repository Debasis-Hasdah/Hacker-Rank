public class ValidUsernameChecker {

    public static void main(String[] args) {

        // Hardcoded usernames
        String[] usernames = {
            "Julia",
            "Samantha",
            "Samantha_21",
            "1Samantha",
            "Samantha?10_2A",
            "JuliaZ007",
            "Julia@007",
            "_Julia007"
        };

        // Regex pattern
        String regex = "^[A-Za-z][A-Za-z0-9_]{7,29}$";

        // Check usernames
        for (String username : usernames) {

            if (username.matches(regex)) {
                System.out.println(username + " -> Valid");
            } else {
                System.out.println(username + " -> Invalid");
            }
        }
    }
}