package pe.edu.ulima.is2.lab2.corrected.ISP;

import java.util.Date;

public interface ShippingService {
    void calculateShippingCost(int orderId);
    void scheduleDelivery(int orderId, Date date);
    void trackShipment(int orderId);
}
