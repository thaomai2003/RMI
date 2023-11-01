package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DatabaseSync extends Remote {
    void syncData(String data) throws RemoteException;
}
