public class TimeConversionVSCode {

    public static String timeConversion(String s) {

        String period = s.substring(8);   
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8); 

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + rest;
    }

    public static void main(String[] args) {

        String[] tests = {
            "07:05:45PM",
            "12:01:00AM",
            "12:01:00PM",
            "01:00:00AM",
            "11:59:59PM"
        };

        for (String t : tests) {
            System.out.println(t + " → " + timeConversion(t));
        }
    }
}