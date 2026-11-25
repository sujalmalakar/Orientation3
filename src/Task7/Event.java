package Task7;

public class Event {

    private double time;
    private int type;

    public Event(double time, int type) {
        this.time = time;
        this.type = type;
    }

    public double getTime() {
        return time;
    }

    public int getType() {
        return type;
    }
}
