package put.io.patterns.implement;

public class SystemInfoObserver implements SystemStateObserver{

    @Override
    public void update(SystemMonitor monitor) {
        SystemState lastSystemState = monitor.getLastSystemState();

        // Print information to the console
        System.out.println("============================================");
        System.out.printf("CPU Load: %2.2f%%%n", lastSystemState.getCpu());
        System.out.printf("CPU temperature: %.2f C%n", lastSystemState.getCpuTemp());
        System.out.printf("Available memory: %.2f MB%n", lastSystemState.getAvailableMemory());
        System.out.printf("USB devices: %d%n", lastSystemState.getUsbDevices());
    }
}
