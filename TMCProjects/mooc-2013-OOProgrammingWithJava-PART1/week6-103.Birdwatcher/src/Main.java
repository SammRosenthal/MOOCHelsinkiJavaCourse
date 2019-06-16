import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner scanner = new Scanner(System.in);
        Library birdLibrary = new Library();


        while (true) {
            if (scanner.nextLine().equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Latin Name: ");
                String latinName = scanner.nextLine();
                birdLibrary.add(new Bird(name, latinName));
            } else if (scanner.next().equals("Observation")) {
                
            }


        }
            
    }

}
