package pe.edu.ulima.is2.lab2.corrected.ISP;

import java.util.Date;
import java.util.List;

public class ShippingOrderProcessor implements OrderManager, ShippingService {

    @Override
    public void createOrder(int customerId, List<Integer> productIds) {
        System.out.println("  Creando orden para cliente " + customerId + " con productos " + productIds);
    }

    @Override
    public void cancelOrder(int orderId) {
        System.out.println("  Cancelando orden " + orderId);
    }

    @Override
    public void updateOrderStatus(int orderId, String status) {
        System.out.println("  Orden " + orderId + " cambia a estado " + status);
    }

    @Override
    public void calculateShippingCost(int orderId) {
        System.out.println("  Calculando costo de envío para orden " + orderId);
    }

    @Override
    public void scheduleDelivery(int orderId, Date date) {
        System.out.println("  Programando entrega de orden " + orderId + " para " + date);
    }

    @Override
    public void trackShipment(int orderId) {
        System.out.println("  Rastreando envío de orden " + orderId);
    }
}
