package ejercicio_03.solucion;

public class PaymentWithDiscount extends PaymentProcessorDecorator {
    
    public PaymentWithDiscount(PaymentProcessor decorado) {
        super(decorado);
    }

    @Override
    public void pay(double amount) {
        double discounted = amount * 0.9;
        System.out.println("Pagando con descuento: ");
        decorado.pay(discounted);
    }
}