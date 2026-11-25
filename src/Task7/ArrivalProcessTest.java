
package Task7;

public class ArrivalProcessTest {

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();

        EventList eventList = new EventList();

        ArrivalProcess arrivalProcess =
                new ArrivalProcess(EventType.ARRIVAL);

        arrivalProcess.createEvents(eventList, 10);

        System.out.println("Generated Events:");

        eventList.printEvents();

        System.out.println("Final clock time: " + clock.getTime());
    }
}
