import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random number = new Random();
        this.numbers = new ArrayList<Integer>();
        int i = 0;

        // Write the number drawing here using the method containsNumber()
        while (i < 7) {
            int currentRoll = (number.nextInt(39) + 1);
            if (containsNumber(currentRoll)) {
                continue;
            } else {
                this.numbers.add(currentRoll);
                i++;
            }

        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
