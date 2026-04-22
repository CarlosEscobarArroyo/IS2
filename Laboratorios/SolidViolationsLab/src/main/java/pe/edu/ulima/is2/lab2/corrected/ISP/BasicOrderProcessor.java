package pe.edu.ulima.is2.lab2.corrected.ISP;

import java.util.List;

public class BasicOrderProcessor implements OrderManager {

    @Override
    public void createOrder(int customerId, List<Integer> productIds) {
        System.out.println("Creando orden para cliente " + customerId + " con productos " + productIds);
    }

    @Override
    public void cancelOrder(int orderId) {
        System.out.println("Cancelando orden " + orderId);
    }

    @Override
    public void updateOrderStatus(int orderId, String status) {
        System.out.println("Orden " + orderId + " cambia a estado " + status);
    }
}
