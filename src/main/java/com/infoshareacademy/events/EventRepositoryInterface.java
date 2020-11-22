package com.infoshareacademy.events;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface EventRepositoryInterface {

    boolean createEvent(Event event);

    boolean deleteEvent(Integer eventId) throws IOException;

    boolean updateEventById(Integer eventId);

    HashSet<Event> convertEvents(Event[] events);

    void showAllEvents() throws IOException;

    void showSingleEvent(Integer eventId) throws IOException;

    List<Event> searchByString(String name);

    List <Event> searchByOrganizer (String organizer);

    List<Event> searchByPlace (String place);

    List<Event> searchActive (Integer active);

    List<Event> searchByName(String name);


}
