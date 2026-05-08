package ejercicio_01.solucion;

public class Main {
    public static void main(String[] args) {

        PaymentFacade facade = new PaymentFacade();
        facade.process(200);
        facade.sendReceipt();
        facade.validate(200);


    }
}
