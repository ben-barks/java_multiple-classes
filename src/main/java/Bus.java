import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> person;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.person = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengers() {
        return person.size();
    }

    public void addPassenger(Person person){
        if (this.capacity > this.person.size()) {
            this.person.add(person);
        }
        else {
            System.out.println("kindly eff off dear");
        }
    }

    public void removePassenger(){
        this.person.remove(0);
    }

    public void pickUp(BusStop busStop){
        Person person = busStop.removeBusees();
        this.addPassenger(person);
    }
}
