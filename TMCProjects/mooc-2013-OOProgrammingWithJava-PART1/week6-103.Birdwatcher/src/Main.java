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
            String command = scanner.nextLine();
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Latin Name: ");
                String latinName = scanner.nextLine();
                birdLibrary.add(new Bird(name, latinName));
            } else if (command.equals("Observation")) {
                System.out.println("What was observed:? ");
                String observed = scanner.nextLine();
                birdLibrary.viewed(observed);
            } else if (command.equals("Statistics")) {
                birdLibrary.statistics();
            } else if (command.equals("Show")) {
                System.out.println("What?");
                String show = scanner.nextLine();
                birdLibrary.show(show);
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }

}
