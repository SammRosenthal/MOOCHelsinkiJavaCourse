import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);


        ArrayList<Student> list = new ArrayList<Student>();
//
//        Student alanTuring = new Student("Alan Turing", "017635727");
//        Student linusTorvalds = new Student("Linus Torvalds", "011288989");
//        Student steveJobs = new Student("Steve Jobs", "013672548");



        while(true){
            System.out.println("name: ");
            String name = reader.nextLine();

            if (name.isEmpty()){
                break;
            }

            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();

            list.add(new Student(name, studentNumber));
        }

        for (Student i : list) {
            System.out.println(i.toString());
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();

        System.out.println("Result: ");
        for (Student i : list) {
            if (i.getName().contains(search)) {
                System.out.println(i.toString());
            }
        }

    }
}
