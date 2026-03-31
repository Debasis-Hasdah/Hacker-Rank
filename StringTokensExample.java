import java.util.*;

public class StringTokensExample {

    public static void main(String[] args) {

        String s = "He is a very very good boy, isn't he?";

        s = s.trim();

        // edge case
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // split using regex
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}