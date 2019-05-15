
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = reader.nextInt();
        System.out.println("Last: ");
        int last = reader.nextInt();

        int sum = 0;

        while (first <= last) {
            sum += first;
            first++;
        }

        System.out.println("Sum is: " + sum);
        
    }
}
