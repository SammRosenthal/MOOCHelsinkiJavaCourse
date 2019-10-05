package life;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size and seed for your world: ");
        String input = scanner.nextLine();
        String[] sizeAndSeed = input.split(" ", 2);
        generateWorld(sizeAndSeed);
    }

    public static void generateWorld(String[] input) {
        Random lifeGenerator = new Random(Long.parseLong(input[1]));

        for (int i = 0; i < (Integer.parseInt(input[0])); i++) {
            String life = "";
            for (int j = 0; j < (Integer.parseInt(input[0])); j++) {
                if (lifeGenerator.nextBoolean()) {
                    life += "O";
                } else {
                    life += " ";
                }
            }
            System.out.println(life);
        }
    }
}
