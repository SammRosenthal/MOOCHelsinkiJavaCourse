public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
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

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int small = Integer.MAX_VALUE;
        int dex = -1;
        for (int i = index; i < array.length; i++) {
            if (array[i] < small) {

                small = array[i];
                dex = i;
            }
        }

        return dex;
    }

    public static void swap (int[] array, int index1, int index2) {
        int one = array[index1];
        int two = array[index2];

        System.out.println(one + " one");
        System.out.println(two + " two");

        array[index1] = two;
        array[index2] = one;

    }

    public static void sort (int[] array) {
        int index = 0;

        while (index < array.length) {
            int indexOfSmallest = indexOfTheSmallestStartingFrom(array, index);
            swap(array, index, indexOfSmallest);
            index++;
        }


    }

}
