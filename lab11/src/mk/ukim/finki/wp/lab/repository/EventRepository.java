package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventRepository{
    private final List<Event> events;

    public EventRepository() {
        events = new ArrayList<>();

        for (int i = 1; i <= 10;i++){
            events.add(new Event(" ", " "));
        }
    }
    public List<Event> findAll() {
        return new ArrayList<>(events);
    }

    public List<Event> searchEvents(String text) {
        return events.stream()
                .filter(event -> event.getName().toLowerCase().contains("text") ||
                        event.getDescription().toLowerCase().contains("text"))
                .collect(Collectors.toList());


    }
}
