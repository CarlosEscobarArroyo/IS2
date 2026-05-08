package ejercicio_03.solucion;

public class PaymentWithLogging extends PaymentProcessorDecorator {

    public PaymentWithLogging(PaymentProcessor decorado) {
        super(decorado);
    }

    @Override
    public void pay(double amount) {
        System.out.println("[LOG] Iniciando pago...");
        decorado.pay(amount);
        System.out.println("[LOG] Pago completado");
    }
}