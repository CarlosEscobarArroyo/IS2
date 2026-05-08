package pe.edu.ulima.is2.lab2.corrected.DIP;

public class OrderService {

    private final NotificationService notificationService;
    private final Logger logger;
    private final OrderRepository repository;

    public OrderService(NotificationService notificationService, Logger logger, OrderRepository repository) {
        this.notificationService = notificationService;
        this.logger = logger;
        this.repository = repository;
    }

    public void processOrder(String customerId, String[] productIds, String notificationType) {
        logger.log("Iniciando procesamiento de pedido para cliente: " + customerId);

        String customerData = repository.getCustomerData(customerId);
        logger.log("Datos de cliente obtenidos: " + customerData);

        String orderId = "ORDER-" + System.currentTimeMillis();
        String orderData = "Pedido " + orderId + " para cliente " + customerId;

        repository.saveOrder(orderData);
        logger.log("Pedido guardado: " + orderId);

        String recipient = "EMAIL".equalsIgnoreCase(notificationType) ? "customer@email.com" : "+123456789";
        notificationService.sendNotification(
                notificationType,
                recipient,
                "Su pedido " + orderId + " ha sido procesado");

        logger.log("Pedido procesado completamente: " + orderId);
    }

    public void cancelOrder(String orderId) {
        logger.log("Cancelando pedido: " + orderId);

        repository.saveOrder("CANCELLED: " + orderId);
        notificationService.sendNotification(
                "EMAIL",
                "customer@email.com",
                "Su pedido " + orderId + " ha sido cancelado");

        logger.log("Pedido cancelado: " + orderId);
    }
}
