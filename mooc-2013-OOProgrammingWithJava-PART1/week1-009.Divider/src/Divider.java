
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.

        System.out.println("Type a number: ");
        double firstInt = reader.nextInt();
        System.out.println("Type another number: ");
        double secondInt = reader.nextInt();

        System.out.println("Division: " + firstInt + " / " + secondInt + " = " + (firstInt/secondInt));
    }
}
