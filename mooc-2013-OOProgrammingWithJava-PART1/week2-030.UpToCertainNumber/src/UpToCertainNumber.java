
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number?");
        int userInt = reader.nextInt();
        int num = 1;

        while (num <= userInt) {
            System.out.println(num);
            num++;
        }
        
    }
}
