package RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DatabaseSyncServer extends UnicastRemoteObject implements DatabaseSync {
    protected DatabaseSyncServer() throws RemoteException {
        super();
    }

    @Override
    public void syncData(String data) throws RemoteException {
        // Xử lý đồng bộ hóa dữ liệu với CSDL của máy chủ
        System.out.println("Synchronized data: " + data);
    }

    public static void main(String[] args) {
        try {
            DatabaseSyncServer server = new DatabaseSyncServer();
            // Đăng ký server với RMI Registry
            Naming.rebind("rmi://localhost/DatabaseSync", server);
            System.out.println("Server is running.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
