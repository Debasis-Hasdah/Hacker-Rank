import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args) {

        // Create 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Row 1
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(41);
        row1.add(77);
        row1.add(74);
        row1.add(22);
        row1.add(44);

        // Row 2
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(12);

        // Row 3
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(37);
        row3.add(34);
        row3.add(36);
        row3.add(52);

        // Row 4 (empty row)
        ArrayList<Integer> row4 = new ArrayList<>();

        // Row 5
        ArrayList<Integer> row5 = new ArrayList<>();
        row5.add(20);
        row5.add(22);
        row5.add(33);

        // Add rows
        list.add(row1);
        list.add(row2);
        list.add(row3);
        list.add(row4);
        list.add(row5);

        // Example Queries

        printValue(list, 1, 3); // 74
        printValue(list, 3, 4); 
        printValue(list, 3, 1); // 37
        printValue(list, 4, 3); // ERROR!
        printValue(list, 5, 5); 
    }

    public static void printValue(ArrayList<ArrayList<Integer>> list,
                                  int x, int y) {

        try {
            System.out.println(list.get(x - 1).get(y - 1));
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }
}