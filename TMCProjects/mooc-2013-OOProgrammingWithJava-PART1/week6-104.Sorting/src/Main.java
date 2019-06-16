
public class Main {
    public static void main(String[] args) {

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

}
