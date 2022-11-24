package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver{
    private Integer lastUSBCount = 0;

    @Override
    public void update(SystemMonitor monitor) {
        SystemState lastSystemState = monitor.getLastSystemState();

        if (lastUSBCount != lastSystemState.getUsbDevices()) {
            System.out.print("State of connected USB devices has changed");
        }

        lastUSBCount = lastSystemState.getUsbDevices();
    }
}
