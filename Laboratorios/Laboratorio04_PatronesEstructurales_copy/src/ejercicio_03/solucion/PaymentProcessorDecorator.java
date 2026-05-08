package ejercicio_03.solucion;

public abstract class PaymentProcessorDecorator implements PaymentProcessor{

    protected PaymentProcessor decorado;

    public PaymentProcessorDecorator(PaymentProcessor decorado) {
        this.decorado = decorado;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Se pago: " + amount);
    }

    
    
}
