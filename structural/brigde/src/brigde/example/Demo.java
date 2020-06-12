package brigde.example;

import brigde.example.devices.Device;
import brigde.example.devices.Radio;
import brigde.example.devices.Tv;
import brigde.example.remotes.AdvancedRemote;
import brigde.example.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
