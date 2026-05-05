package pe.edu.ulima.is2.lab2.corrected.DIP;

import java.util.ArrayList;
import java.util.List;

public class MockRepository implements OrderRepository {

    private final List<String> savedOrders = new ArrayList<>();

    @Override
    public void saveOrder(String orderData) {
        savedOrders.add(orderData);
        System.out.println("[MOCK REPO] Orden guardada: " + orderData);
    }

    @Override
    public String getCustomerData(String customerId) {
        return "[MOCK] Cliente " + customerId;
    }

    public List<String> getSavedOrders() {
        return savedOrders;
    }
}
