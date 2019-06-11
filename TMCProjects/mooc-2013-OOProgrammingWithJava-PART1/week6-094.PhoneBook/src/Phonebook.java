import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<Person>();

    public Phonebook () {
        this.phonebook.clear();
    }

    public void add(String name, String number) {
        this.phonebook.add(new Person(name, number));
    }

    public void printAll() {
        for (Person i : phonebook) {
            System.out.println(i);
        }
    }

    public String searchNumber(String name) {
        for (Person i : phonebook) {
            if (i.getName().equals(name)) {
                return i.getNumber();
            }
        }

        return "number not known";
    }
}
