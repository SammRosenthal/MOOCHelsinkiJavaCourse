import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int count = 0;

        if (name.length() > 2) {
            while (count < 3) {
                System.out.println((count + 1) + ". character: " + (name.charAt(count)));
                count++;
            }
        }
    }
}
