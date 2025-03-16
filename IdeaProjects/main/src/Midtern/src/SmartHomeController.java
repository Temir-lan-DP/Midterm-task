import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllLightsOn() {
        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                device.turnOn();
            }
        }
    }

    public void setGlobalTemperature() {
        for (SmartDevice device : devices) {
            if (device instanceof Thermostat) {
                device.turnOn();
            }
        }
    }

    public void getSystemStatusReport() {
        System.out.println("System Status Report:");
        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                System.out.println("Light is operational.");
            } else if (device instanceof Thermostat) {
                System.out.println("Thermostat is operational.");
            }
        }
    }
}