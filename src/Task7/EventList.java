package Task7;

import java.util.ArrayList;

public class EventList {

    private ArrayList<Event> events;

    public EventList() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        if (!events.isEmpty()) {
            return events.remove(0);
        }

        return null;
    }

    public boolean isEmpty() {
        return events.isEmpty();
    }

    public void printEvents() {
        for (Event event : events) {
            System.out.println("Time: " + event.getTime()
                    + " Type: " + event.getType());
        }
    }
}
