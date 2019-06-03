public class Counter {

    private int counter;
    private boolean check;

    public Counter () {
        this(0, false);
    }

    public Counter (int startingValue) {
        this(startingValue, false);
    }

    public Counter (boolean check) {
        this(0, check);
    }

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public int value () {
        return this.counter;
    }

    public void increase () {
        if (this.check == true && this.counter++ < 0) {
            this.counter = 0;
        } else {
            this.counter++;
        }
    }

    public void decrease () {
        System.out.println("start of decrease - " + this.counter);

        this.counter--;

        if (this.check == true && this.counter < 0) {
            this.counter = 0;
        }
    }

    public void increase (int increase) {
        if (increase > 0) {
            this.counter += increase;
        }
    }

    public void decrease (int decrease) {
        System.out.println("bad");
        if (decrease >= 0) {
            if (check == true && this.counter - decrease < 0) {
                this.counter = 0;
            } else {
                this.counter -= decrease;
            }
        }
    }
}
