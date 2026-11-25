package Task7;

import eduni.distributions.Negexp;

public class ArrivalProcess {

    private int eventType;
    private Negexp random;

    public ArrivalProcess(int eventType) {
        this.eventType = eventType;
        random = new Negexp(10.0);
    }

    public void createEvents(EventList eventList, int numberOfEvents) {

        Clock clock = Clock.getInstance();

        for (int i = 0; i < numberOfEvents; i++) {

            double interval = random.sample();

            double newTime = clock.getTime() + interval;

            clock.setTime(newTime);

            Event event = new Event(newTime, eventType);

            eventList.addEvent(event);
        }
    }
}
