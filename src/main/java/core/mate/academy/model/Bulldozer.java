package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double maxPushingCapacity;

    public Bulldozer() {
    }

    public Bulldozer(double maxPushingCapacity) {
        this.maxPushingCapacity = maxPushingCapacity;
    }

    public double getMaxPushingCapacity() {
        return maxPushingCapacity;
    }

    public void setMaxPushingCapacity(double maxPushingCapacity) {
        this.maxPushingCapacity = maxPushingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
