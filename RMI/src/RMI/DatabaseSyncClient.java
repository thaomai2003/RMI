package RMI;

import java.rmi.Naming;

public class DatabaseSyncClient {
    public static void main(String[] args) {
        try {
            DatabaseSync remoteServer = (DatabaseSync) Naming.lookup("rmi://localhost/DatabaseSync");

            // Gọi các phương thức trên remoteServer để đồng bộ hóa dữ liệu
            remoteServer.syncData("Data to sync");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
