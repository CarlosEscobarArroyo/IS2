package EjemploDB.Singleton;

import java.util.UUID;

public class DatabaseConnector {
    private String connectionId;
    private static DatabaseConnector instance;

    private DatabaseConnector() {
        this.connectionId = UUID.randomUUID().toString();
        System.out.println("La conexión ha sido establecida: " + this.connectionId);
        simulateHeavyResourceUsage();
    }

    public static synchronized DatabaseConnector getInstance() {
        if (instance==null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }




    private void simulateHeavyResourceUsage(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void executeQuery(String query) {
        System.out.println("DB-" + connectionId + " Ejecutando " + query);
    }

}


