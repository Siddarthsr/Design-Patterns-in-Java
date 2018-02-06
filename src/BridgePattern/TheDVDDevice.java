// Concrete Implementor

// Here is an implementation of the EntertainmentDevice
// abstract class. I'm specifying what makes it different
// from other devices
package BridgePattern;
public class TheDVDDevice extends EntertainmentDevice {
	
	public TheDVDDevice(int newDeviceState, int newMaxSetting){
		
		super.deviceState = newDeviceState;
		
		super.maxSetting = newMaxSetting;
		
	}
	
	public void buttonFivePressed() {
		
		System.out.println("DVD skips to Chapter");
		
		deviceState--;
		
	}

	public void buttonSixPressed() {
		
		System.out.println("DVD skips to next chapter");
		
		deviceState++;
		
	}
	
}