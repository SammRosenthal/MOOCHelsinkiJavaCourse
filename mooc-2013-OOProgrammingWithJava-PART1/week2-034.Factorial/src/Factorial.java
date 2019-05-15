import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = reader.nextInt();

        int factorial = 1;

        while (num > 0) {
            factorial *= num;
            num--;
        }

        if (factorial == 0) {
            System.out.println("Factorial is 1");
        } else {
            System.out.println("Factorial is " + factorial);
        }

    }
}
