public class DrawingBook {

    public static int pageCount(int n, int p) {

        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);

        return Math.min(fromFront, fromBack);
    }

    public static void main(String[] args) {

        int n1 = 6, p1 = 2;
        int n2 = 5, p2 = 4;

        System.out.println("Example i: " + pageCount(n1, p1));
        System.out.println("Example ii: " + pageCount(n2, p2));
    }
}