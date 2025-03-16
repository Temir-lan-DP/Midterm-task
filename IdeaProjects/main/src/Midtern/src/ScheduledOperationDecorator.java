public class ScheduledOperationDecorator extends SmartDeviceDecorator {
    private String schedule;

    public ScheduledOperationDecorator(SmartDevice decoratedDevice, String schedule) {
        super(decoratedDevice);
        this.schedule = schedule;
    }

    @Override
    public void turnOn() {
        System.out.println("Scheduled to turn on at " + schedule);
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Scheduled to turn off at " + schedule);
        super.turnOff();
    }
}