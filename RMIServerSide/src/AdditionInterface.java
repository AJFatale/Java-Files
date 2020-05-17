import java.rmi.*;
import java.rmi.server.*;


public interface AdditionInterface extends Remote {

	public int add(int a, int b)throws RemoteException;
	
}
