package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Event;
import mk.ukim.finki.wp.lab.model.EventBooking;
import mk.ukim.finki.wp.lab.repository.EventRepository;

import java.util.List;

public interface EventService{
    List<Event> listAll();
    List<Event> searchEvents(String text);
}
