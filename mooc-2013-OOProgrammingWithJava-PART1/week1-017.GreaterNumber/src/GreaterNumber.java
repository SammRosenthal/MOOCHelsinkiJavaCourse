import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int first = reader.nextInt();

        System.out.println("Type hte second number: ");
        int second = reader.nextInt();

        if (first == second) {
            System.out.println("The numbers are equal!");
        } else if (first > second) {
            System.out.println("Greater number: " + first);
        } else if (second > first) {
            System.out.println("Greater number: " + second);
        }

    }
}
