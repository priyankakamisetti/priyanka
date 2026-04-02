package inheritanceviainterface;
interface Chargeable{
	void charge(int percentage);
	int getBatteryLevel();	
}

interface Connectable{
	void connectToWifi(String network);
	void connectToBluetooth(String device);
}

abstract class SmartPhone implements Chargeable,Connectable {
	String brand;
	int battery=0;
	String wifiName;
	String btDevice;
	
	SmartPhone(String brand){
	this.brand = brand;
}
//chargeable
public void charge(int percentage) {
	if (percentage > 0) {
        battery += percentage;

        if (battery > 100) {
            battery = 100;
        }

        System.out.println(brand + " charged to " + battery + "%");
    } else {
        System.out.println("Invalid charging value");
    }
}

public int getBatteryLevel() {
    return battery;
}

//connectable

public void connectToWifi(String network) {
	wifiName=network;
	System.out.println(brand + "Connect to Wifi:" +wifiName);	
}
public void connectToBluetooth(String device) {
    btDevice = device;
    System.out.println(brand + " connected to Bluetooth device: " + btDevice);
}
}





public class SmartDevice {

}
