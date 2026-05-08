package EjemploDB.NoSingleton;

public class ServiceB {
    public void generateReport(){
        System.out.println("ServiceB: Generando reporte...");
        DatabaseConnector db = new DatabaseConnector();
        db.executeQuery("SELECT * FROM reporte");
    }


}
