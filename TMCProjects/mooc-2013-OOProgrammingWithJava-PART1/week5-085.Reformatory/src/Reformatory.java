public class Reformatory {

    private int measured;

    public Reformatory () {
        this.measured = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        this.measured++;
        return person.getWeight();

    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return this.measured;
    }

}
