package ejercicio_02.solucion;

public class PaymentService {
    public void processPayment(PaymentProcessor processor, double amount) {
        processor.pay(amount);
    }

}
