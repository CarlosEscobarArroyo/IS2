package ejercicio_02.solucion;

public class StripeAdapter implements PaymentProcessor{
    private StripeAPI stripeAPI;

    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    @Override
    public void pay(double amount) {
        this.stripeAPI.makeCharge(amount);
    }
}
