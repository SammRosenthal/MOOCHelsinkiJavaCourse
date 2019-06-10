
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
       String answer = "";

       for (int i = 0; i < array.length; i++) {
           if (i + 1 < array.length) {
               answer += array[i] + ", ";
           } else {
               answer += array[i];
           }
       }

        System.out.println(answer);
    }
}
