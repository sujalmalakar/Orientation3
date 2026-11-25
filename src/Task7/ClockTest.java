package Task7;

public class ClockTest {

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();

        System.out.println("Current time: " + clock.getTime());

        clock.setTime(10);

        System.out.println("New time: " + clock.getTime());

        clock.setTime(25);

        System.out.println("New time: " + clock.getTime());
    }
}