public class TimeConversionExample {

    public static String timeConversion(String s) {

        String period = s.substring(8);   // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8); // :mm:ss

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else { // PM
            if (hour != 12) {
                hour += 12;
            }
        }

        // format hour with leading zero
        return String.format("%02d", hour) + rest;
    }

    public static void main(String[] args) {

        String t1 = "07:05:45PM";
        String t2 = "12:01:00AM";
        String t3 = "12:01:00PM";

        System.out.println(t1 + " → " + timeConversion(t1));
        System.out.println(t2 + " → " + timeConversion(t2));
        System.out.println(t3 + " → " + timeConversion(t3));
    }
}