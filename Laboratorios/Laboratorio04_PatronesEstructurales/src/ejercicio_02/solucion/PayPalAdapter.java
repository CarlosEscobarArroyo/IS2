package ejercicio_02.solucion;

public class PayPalAdapter implements PaymentProcessor{
    private PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void pay(double amount) {
        this.payPalAPI.sendPayment(amount);        
    }

    
}
