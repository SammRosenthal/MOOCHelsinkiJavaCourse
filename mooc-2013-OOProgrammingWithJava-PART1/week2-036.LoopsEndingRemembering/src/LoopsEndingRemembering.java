import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;


        while (true) {
            System.out.println("Type numbers: ");
            int num = reader.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += num;
            count++;
        }

        double average = (double)sum / count;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
