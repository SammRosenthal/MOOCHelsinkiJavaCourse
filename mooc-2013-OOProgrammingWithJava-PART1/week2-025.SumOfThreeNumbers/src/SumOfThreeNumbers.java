
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read

        System.out.println("Type the first number: ");
        sum += reader.nextInt();
        System.out.println("Type hte second number: ");
        sum += reader.nextInt();
        System.out.println("Type the third number: ");
        sum += reader.nextInt();
        System.out.println("Sum: " + sum);
    }
}
