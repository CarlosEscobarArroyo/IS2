package pe.edu.ulima.is2.lab2.corrected.ISP;

import java.util.Date;
import java.util.List;

public class CompleteOrderProcessor implements PaymentHandler, OrderManager, InventoryManager, NotificationSender, ReportGenerator, ShippingService {

    @Override
    public void createOrder(int customerId, List<Integer> productIds) {
        System.out.println(" Creando orden para cliente " + customerId);
    }

    @Override
    public void cancelOrder(int orderId) {
        System.out.println(" Cancelando orden " + orderId);
    }

    @Override
    public void updateOrderStatus(int orderId, String status) {
        System.out.println(" Orden " + orderId + " -> " + status);
    }

    @Override
    public boolean processPayment(int orderId, String method, String data) {
        System.out.println(" Procesando pago de orden " + orderId + " con " + method);
        return true;
    }

    @Override
    public void processRefund(int orderId, double amount) {
        System.out.println(" Reembolso de " + amount + " para orden " + orderId);
    }

    @Override
    public boolean checkProductAvailability(int productId, int qty) {
        System.out.println(" Verificando stock producto " + productId + " x" + qty);
        return true;
    }

    @Override
    public void reserveProduct(int productId, int qty) {
        System.out.println(" Reservando producto " + productId + " x" + qty);
    }

    @Override
    public void releaseProductReservation(int productId, int qty) {
        System.out.println(" Liberando reserva producto " + productId + " x" + qty);
    }

    @Override
    public void sendOrderConfirmation(int orderId) {
        System.out.println(" Confirmación enviada para orden " + orderId);
    }

    @Override
    public void sendShippingNotification(int orderId) {
        System.out.println(" Notificación de envío para orden " + orderId);
    }

    @Override
    public void sendDeliveryNotification(int orderId) {
        System.out.println(" Notificación de entrega para orden " + orderId);
    }

    @Override
    public String generateOrderReport(int orderId) {
        return "Reporte de orden " + orderId;
    }

    @Override
    public String generateDailyReport(Date date) {
        return "Reporte diario " + date;
    }

    @Override
    public String generateCustomerReport(int customerId) {
        return "Reporte del cliente " + customerId;
    }

    @Override
    public void calculateShippingCost(int orderId) {
        System.out.println(" Calculando envío orden " + orderId);
    }

    @Override
    public void scheduleDelivery(int orderId, Date date) {
        System.out.println(" Programando entrega orden " + orderId + " para " + date);
    }

    @Override
    public void trackShipment(int orderId) {
        System.out.println(" Rastreando envío orden " + orderId);
    }
}
