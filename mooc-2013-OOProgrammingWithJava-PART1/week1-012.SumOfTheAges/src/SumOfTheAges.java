
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String firstName = reader.nextLine();
        System.out.println("Type your age: ");
        int firstAge = reader.nextInt();
        System.out.println("Type your name: " );
        reader.nextLine();
        String secondName = reader.nextLine();
        System.out.println("Type your age: ");
        int secondAge = reader.nextInt();

        System.out.println(firstName + " and " + secondName + " are " + (firstAge + secondAge) + " years old in total.");
    }
}
