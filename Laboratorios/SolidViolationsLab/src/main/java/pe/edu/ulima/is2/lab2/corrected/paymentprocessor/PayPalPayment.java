package pe.edu.ulima.is2.lab2.corrected.paymentprocessor;

public class PayPalPayment implements PaymentMethod{
    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con PayPal por $" + amount);
        // Simulación de autenticación PayPal
        if (!data.contains("@")) {
            return false;
        }
        System.out.println("Pago con PayPal procesado exitosamente");
        return true;    }

    @Override
    public double calculateProcessingFee(double amount) {
        return 0;
    }

    @Override
    public String getPaymentType() {
        return "";
    }
}
