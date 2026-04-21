package pe.edu.ulima.is2.lab2.corrected.ISP;

public interface InventoryManager {
    boolean checkProductAvailability(int productId, int qty);
    void reserveProduct(int productId, int qty);
    void releaseProductReservation(int productId, int qty);
}
