public class Bird {
    private String name;
    private String latinName;
    private int views;


    public Bird (String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.views = 0;
    }

    public void observation () {
        this.views++;
    }

    public String toString () {
        return this.name + " (" + this.latinName + "): " + this.views + " observations";
    }

    public String getName () {
        return this.name;
    }

    public String getLatinName () {
        return this.latinName;
    }

    public int getViews () {
        return this.views;
    }
}
