public class Thermostat implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned off.");
    }
}