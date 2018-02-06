// This interface will contain just those methods
// that you want the proxy to provide access to
package ProxyPattern;
public interface GetATMData
{
  public ATMState getATMState();
  public int getCashInMachine();
}