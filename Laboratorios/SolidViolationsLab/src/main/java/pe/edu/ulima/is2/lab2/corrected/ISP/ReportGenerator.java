package pe.edu.ulima.is2.lab2.corrected.ISP;

import java.util.Date;

public interface ReportGenerator {
    String generateOrderReport(int orderId);
    String generateDailyReport(Date date);
    String generateCustomerReport(int customerId);
}
