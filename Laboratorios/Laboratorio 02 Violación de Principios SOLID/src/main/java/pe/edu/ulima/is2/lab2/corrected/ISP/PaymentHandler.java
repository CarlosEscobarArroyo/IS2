package pe.edu.ulima.is2.lab2.corrected.ISP;

public interface PaymentHandler {
    boolean processPayment(int orderId, String method, String data);
    
    void processRefund(int orderId, double amount);

}
