package mk.ukim.finki.wp.lab.model;


public class Event {
    String name;
    String description;
    double popularityScore;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
