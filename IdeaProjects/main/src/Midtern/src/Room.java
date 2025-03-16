import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}