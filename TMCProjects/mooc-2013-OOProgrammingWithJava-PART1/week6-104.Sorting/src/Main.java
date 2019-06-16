
public class Main {
    public static void main(String[] args) {
        int[] test = {6, 3, 0, -1, 4};

        indexOfTheSmallest(test);
    }

    public static int smallest(int[] array){
        int small = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < small) {
                small = i;
            }
        }

        return small;
    }

    public static int indexOfTheSmallest(int[] array) {
        int small = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {

                small = array[i];
                index = i;
            }
        }

        return index;
    }

}
