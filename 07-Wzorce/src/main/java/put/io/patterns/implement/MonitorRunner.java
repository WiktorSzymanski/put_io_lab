package put.io.patterns.implement;

public class MonitorRunner {

    public static void main(String args[]){
        SystemMonitor monitor = new SystemMonitor();


        SystemStateObserver infObserver =  new SystemInfoObserver();
        SystemCoolerObserver coolerObserver = new SystemCoolerObserver();
        SystemGarbageCollectorObserver garbageCollectorObserver = new SystemGarbageCollectorObserver();
        USBDeviceObserver usbDeviceObserver = new USBDeviceObserver();

        monitor.addSystemStateObserver(infObserver);
        monitor.addSystemStateObserver(coolerObserver);
        monitor.addSystemStateObserver(garbageCollectorObserver);
        monitor.addSystemStateObserver(usbDeviceObserver);

        while (true) {

            monitor.probe();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
