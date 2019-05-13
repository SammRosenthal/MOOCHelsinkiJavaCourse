
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");

        int number = reader.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive.");
        } else {
            System.out.println("Your number is not positive.");
        }
    }
}
