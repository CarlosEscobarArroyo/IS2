package ejercicio_03.solucion;

public class PaymentWithFraudCheck extends PaymentProcessorDecorator {

    public PaymentWithFraudCheck(PaymentProcessor decorado) {
        super(decorado);
    }

    @Override
    public void pay(double amount) {
        if (amount > 1000) {
            System.out.println("⚠ Revisando posible fraude...");
        }
        decorado.pay(amount);
    }
}