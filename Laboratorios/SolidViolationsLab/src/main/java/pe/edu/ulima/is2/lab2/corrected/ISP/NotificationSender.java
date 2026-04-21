package pe.edu.ulima.is2.lab2.corrected.ISP;

public interface NotificationSender {
    void sendOrderConfirmation(int orderId);
    void sendShippingNotification(int orderId);
    void sendDeliveryNotification(int orderId);
}
