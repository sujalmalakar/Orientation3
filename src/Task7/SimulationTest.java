package Task7;

public class SimulationTest {

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();

        EventList eventList = new EventList();

        ArrivalProcess arrivalProcess =
                new ArrivalProcess(EventType.ARRIVAL);

        ServicePoint servicePoint = new ServicePoint();

        arrivalProcess.createEvents(eventList, 10);

        System.out.println("Final event time: " + clock.getTime());

        System.out.println("\nProcessing events:");

        while (!eventList.isEmpty()) {

            Event event = eventList.getNextEvent();

            Customer customer = new Customer(event.getTime());

            servicePoint.addCustomer(customer);

            System.out.println("Customer arrived at: "
                    + customer.getArrivalTime());
        }

        clock.setTime(clock.getTime() + 5);

        System.out.println("\nCustomer time in system:");

        while (!servicePoint.isEmpty()) {

            Customer customer = servicePoint.removeCustomer();

            double timeInSystem =
                    clock.getTime() - customer.getArrivalTime();

            System.out.println("Time in system: " + timeInSystem);
        }
    }
}
