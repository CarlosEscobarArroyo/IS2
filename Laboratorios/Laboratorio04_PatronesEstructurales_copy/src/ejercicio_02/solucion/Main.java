package ejercicio_02.solucion;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        PaymentProcessor paypal = new PayPalAdapter(new PayPalAPI());
        PaymentProcessor mc = new MercadoPagoAdapter(new MercadoPagoAPI());
        PaymentProcessor stripe = new StripeAdapter(new StripeAPI());

        service.processPayment(mc, 200);
        service.processPayment(paypal, 300);
        service.processPayment(stripe, 400);
    }
    
}
