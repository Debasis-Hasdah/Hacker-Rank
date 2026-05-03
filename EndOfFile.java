public class EndOfFile {

    public static void main(String[] args) {

        String[] lines = {
            "Hello world",
            "I am a file",
            "Read me until end-of-file."
        };

        int i = 1;

        for (String line : lines) {
            System.out.println(i + " " + line);
            i++;
        }
    }
}