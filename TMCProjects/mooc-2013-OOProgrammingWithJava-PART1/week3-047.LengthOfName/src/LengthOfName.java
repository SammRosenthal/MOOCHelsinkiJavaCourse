
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        int length = calculateCharacters("Pekka");
        System.out.println("Number of characters: " + length);
    }
    
    // do here the method
     public static int calculateCharacters(String text) {
        return text.length();
     }
    
}
