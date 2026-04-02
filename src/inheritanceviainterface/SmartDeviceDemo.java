package inheritanceviainterface;

public class SmartDeviceDemo {
public static void main(String[] args) {
 	SmartPhone s = new SmartPhone("OnePlus");
	s.charge(80);
	
	s.connectToWifi("HomeNet");
	s.connectToBluetooth("JBL Speaker");
	
	System.out.println("Battery Level: " + s.getBatteryLevel() + "%");
	
}

}
