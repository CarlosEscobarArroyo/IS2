package EjemploDB.NoSingleton;

import java.util.UUID;

public class DatabaseConnector {
    private String connectionId;

    public DatabaseConnector() {
        this.connectionId = UUID.randomUUID().toString();
        System.out.println("La conexión ha sido establecida: " + this.connectionId);
        simulateHeavyResourceUsage();
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


