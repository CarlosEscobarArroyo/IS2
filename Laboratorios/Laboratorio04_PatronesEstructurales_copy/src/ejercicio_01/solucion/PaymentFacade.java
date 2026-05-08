package ejercicio_01.solucion;

public class PaymentFacade {
    NotificationService notifier;
    PaymentGateway gateway;
    PaymentValidator validator;

    public PaymentFacade() {
        notifier = new NotificationService();
        gateway = new PaymentGateway();
        validator = new PaymentValidator();
    }

    public void sendReceipt() {
        notifier.sendReceipt();
    }

    public void process(double amount) {
        gateway.process(amount);
    }

    public void validate(double amount) {
        validator.validate(amount);
    }
}



