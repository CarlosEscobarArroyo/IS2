package EjemploDB.NoSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("SIMULACIÓN DEL PROBLEMA SIN SINGLETON");

        ServiceA sA = new ServiceA();
        ServiceB sB = new ServiceB();
        
        sA.processData();
        sB.generateReport();

    }
}
