public class Kangaroo {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // if second is ahead and faster → impossible
        if (v1 <= v2) {
            return "NO";
        }

        // check if meeting happens at integer jumps
        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

        System.out.println("Example 1: " + kangaroo(0, 3, 4, 2)); // YES
        System.out.println("Example 2: " + kangaroo(0, 2, 5, 3)); // NO
    }
}