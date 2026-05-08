package EjemploDB.Singleton;

public class ServiceB {
    public void generateReport(){
        System.out.println("ServiceB: Generando reporte...");
        DatabaseConnector db = DatabaseConnector.getInstance();
        db.executeQuery("SELECT * FROM reporte");
    }


}
