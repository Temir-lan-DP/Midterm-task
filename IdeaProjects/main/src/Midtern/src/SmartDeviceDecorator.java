public abstract class SmartDeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public SmartDeviceDecorator(SmartDevice decoratedDevice) {
        this.decoratedDevice = decoratedDevice;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff();
    }
}