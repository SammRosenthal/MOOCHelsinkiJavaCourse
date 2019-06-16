import java.util.ArrayList;

public class Library {

    private ArrayList<Bird> birdList;

    public Library () {
        this.birdList = new ArrayList<Bird>();
    }

    public void add (Bird newBird) {
        this.birdList.add(newBird);
    }

    public void statistics () {
        for (Bird i : birdList) {
            System.out.println(i);
        }
    }

    public void show (String search) {
        for (Bird i : birdList) {
            if (i.getLatinName().contains(search) || i.getName().contains(search)) {
                System.out.println(i);
            }
        }
    }

    public void viewed (String name) {
        int birdsFound = 0;
        for (Bird i : birdList) {
            if (i.getName().contains(name)) {
                i.observation();
            }
        }

        if (birdsFound == 0) {
            System.out.println("Is not a bird!");
        }
    }
}
