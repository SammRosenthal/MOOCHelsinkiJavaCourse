
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int userInput = reader.nextInt();
        int sum = 0;

        while (userInput >= 1) {
            sum += userInput;
            userInput--;
        }

        System.out.println("Sum is " + sum);
    }
}
