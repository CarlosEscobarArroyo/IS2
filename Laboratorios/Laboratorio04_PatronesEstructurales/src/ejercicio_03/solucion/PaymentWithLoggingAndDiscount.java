package ejercicio_03.solucion;
;

public class PaymentWithLoggingAndDiscount extends PaymentProcessorDecorator {

    public PaymentWithLoggingAndDiscount(PaymentProcessor decorado) {
        super(decorado);
    }

    @Override
    public void pay(double amount) {
        System.out.println("[LOG] Iniciando pago...");
        double discounted = amount * 0.9;
        System.out.println("Pagando con descuento: ");
        decorado.pay(discounted);
        System.out.println("[LOG] Pago completado");
    }
}