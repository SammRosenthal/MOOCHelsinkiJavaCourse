import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    Random charFinder = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password

        int count = 0;
        String pass = "";

        while (count < this.length) {
            String symbol = "abcdefghijklmnopqrstuvwxyz";
            int index = charFinder.nextInt(26);
            char currentChar = symbol.charAt(index);
            System.out.println("currentChar - " + symbol.charAt(index));
            pass += currentChar;
            count++;
        }
        System.out.println(pass);
        return pass;
    }
}
