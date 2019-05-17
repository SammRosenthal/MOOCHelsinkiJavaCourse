import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();
        String reversed = "";
        int count = name.length() - 1;

        while (count >= 0) {
            reversed += name.charAt(count);
            count--;
        }
        System.out.println("In reverse order: " + reversed);
    }
}
