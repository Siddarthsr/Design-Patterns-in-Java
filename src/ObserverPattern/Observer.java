// The Observers update method is called when the Subject changes
package ObserverPattern;
public interface Observer {
	
	public void update(double ibmPrice, double aaplPrice, double googPrice);
	
}