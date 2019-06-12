import java.util.Random;

public class NightSky {

    private int width;
    private int height;
    private double density;
    private int stars;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.stars = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.stars = 0;

    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.height = height;
        this.width = width;
        this.stars = 0;

    }

    public void printLine () {
        String line = "";
        Random star = new Random();
        for (int i =0; i < this.width; i++) {

            if (star.nextDouble() <= this.density) {
                this.stars++;
                line += "*";
            } else {
                line += " ";
            }
        }

        System.out.println(line);
    }

    public void print () {
        this.stars = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint () {
        return this.stars;
    }
}
