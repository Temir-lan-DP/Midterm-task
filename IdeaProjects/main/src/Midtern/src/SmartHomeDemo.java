public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        SmartDevice livingRoomLight = factory.createLight("Living Room Light");
        SmartDevice kitchenLight = factory.createLight("Kitchen Light");
        SmartDevice thermostat = factory.createThermostat();

        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(livingRoomLight);
        livingRoom.addDevice(thermostat);

        Room kitchen = new Room("Kitchen");
        kitchen.addDevice(kitchenLight);

        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(kitchen);

        controller.turnAllLightsOn();

        controller.getSystemStatusReport();

        SmartDevice scheduledLight = new ScheduledOperationDecorator(livingRoomLight, "08:00 AM");
        scheduledLight.turnOn();
    }
}