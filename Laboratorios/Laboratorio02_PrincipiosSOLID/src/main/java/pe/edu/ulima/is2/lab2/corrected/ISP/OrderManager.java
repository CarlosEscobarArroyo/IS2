package pe.edu.ulima.is2.lab2.corrected.ISP;

import java.util.List;

public interface OrderManager {
    void createOrder(int customerId, List<Integer> productIds);
    void cancelOrder(int orderId);
    void updateOrderStatus(int orderId, String status);
}
