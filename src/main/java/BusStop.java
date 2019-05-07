import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int countBusees() {
        return this.queue.size();
    }

    public void addBusees(Person person) {
        this.queue.add(person);
    }

    public Person removeBusees() {
        return this.queue.remove(0);
    }
}
