package EjemploDB.NoSingleton;

public class ServiceA {
    public void processData() {
        System.out.println("Service A: Iniciando proceso...");
        DatabaseConnector db = new DatabaseConnector();
        db.executeQuery("SELECT * FROM users");


    }





}
