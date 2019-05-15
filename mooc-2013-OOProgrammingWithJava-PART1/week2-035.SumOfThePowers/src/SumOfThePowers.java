
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = reader.nextInt();

        int result = 0;

        while (num >= 0) {
            result += (int)Math.pow(2, num);
            num--;
        }


        System.out.println("The result is: " + result);
    }
}
