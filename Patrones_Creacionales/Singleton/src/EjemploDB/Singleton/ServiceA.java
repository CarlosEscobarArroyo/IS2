package EjemploDB.Singleton;

public class ServiceA {
    public void processData() {
        System.out.println("Service A: Iniciando proceso...");
        DatabaseConnector db = DatabaseConnector.getInstance();
        db.executeQuery("SELECT * FROM users");


    }

}
