package mk.ukim.finki.wp.lab.service.impl;
import mk.ukim.finki.wp.lab.model.EventBooking;
import mk.ukim.finki.wp.lab.service.EventBookingService;
public class EventBookingServiceImpl implements EventBookingService {

    @Override
    public EventBooking placeBooking(String eventName, String attendeeName, String attendeeAddress, int numberOfTickets) {
        return new EventBooking();
    }
}