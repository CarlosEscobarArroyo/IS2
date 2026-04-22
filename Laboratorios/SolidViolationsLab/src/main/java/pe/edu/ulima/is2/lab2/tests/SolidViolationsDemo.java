package pe.edu.ulima.is2.lab2.tests;

import pe.edu.ulima.is2.lab2.corrected.LSP.DigitalProduct;
import pe.edu.ulima.is2.lab2.corrected.LSP.PhysicalProduct;
import pe.edu.ulima.is2.lab2.corrected.LSP.Product;
import pe.edu.ulima.is2.lab2.corrected.LSP.ServiceProduct;
import pe.edu.ulima.is2.lab2.corrected.OCP.ApplePayPayment;
import pe.edu.ulima.is2.lab2.corrected.OCP.BankTransferPayment;
import pe.edu.ulima.is2.lab2.corrected.OCP.CreditCardPayment;
import pe.edu.ulima.is2.lab2.corrected.OCP.PayPalPayment;
import pe.edu.ulima.is2.lab2.corrected.OCP.PaymentMethod;
import pe.edu.ulima.is2.lab2.corrected.OCP.PaymentProcessor;
import pe.edu.ulima.is2.lab2.corrected.SRP.DiscountCalculator;
import pe.edu.ulima.is2.lab2.corrected.SRP.User;
import pe.edu.ulima.is2.lab2.corrected.SRP.UserReportGenerator;
import pe.edu.ulima.is2.lab2.corrected.ISP.BasicOrderProcessor;
import pe.edu.ulima.is2.lab2.corrected.ISP.CompleteOrderProcessor;
import pe.edu.ulima.is2.lab2.corrected.ISP.OrderManager;
import pe.edu.ulima.is2.lab2.corrected.ISP.ShippingOrderProcessor;
import pe.edu.ulima.is2.lab2.corrected.ISP.ShippingService;
import pe.edu.ulima.is2.lab2.corrected.DIP.EmailNotificationService;
import pe.edu.ulima.is2.lab2.corrected.DIP.FileLoggerService;
import pe.edu.ulima.is2.lab2.corrected.DIP.DatabaseOrderRepository;
import pe.edu.ulima.is2.lab2.corrected.DIP.NotificationService;
import pe.edu.ulima.is2.lab2.corrected.DIP.Logger;
import pe.edu.ulima.is2.lab2.corrected.DIP.OrderRepository;
import pe.edu.ulima.is2.lab2.corrected.DIP.OrderService;

import java.util.Date;
import java.util.List;

public class SolidViolationsDemo {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE VIOLACIONES SOLID ===\n");

        // TODO: Ejecutar ejemplos de cada violación
        // TODO: Mostrar problemas que causan
        // TODO: Ejecutar versiones corregidas
        // TODO: Comparar diferencias

        demonstrateSRPViolation();
        demonstrateOCPViolation();
        demonstrateLSPViolation();
        demonstrateISPViolation();
        demonstrateDIPViolation();
    }

    private static void demonstrateSRPViolation() {
        System.out.println("--- SRP Violation ---");
        // TODO: Implementar demostración
        User user = new User(
                "Pepito",
                "pepito@aloe.ulima.edu.pe",
                "PREMIUM",
                2500
        );

        DiscountCalculator discountCalculator = new DiscountCalculator();
        UserReportGenerator userReportGenerator = new UserReportGenerator(discountCalculator);
        System.out.println(userReportGenerator.generateUserReport(user));

    }

    private static void demonstrateOCPViolation() {
        System.out.println("--- OCP Violation ---");
        // TODO: Implementar demostración
        PaymentProcessor procesador = new PaymentProcessor();
        PaymentMethod tarjeta = new CreditCardPayment();
        PaymentMethod bitcoin = new ApplePayPayment();
        PaymentMethod tranferencia = new BankTransferPayment();
        PaymentMethod paypal = new PayPalPayment();

        procesador.registerPaymentMethod(paypal);
        procesador.registerPaymentMethod(tarjeta);
        procesador.registerPaymentMethod(bitcoin);
        procesador.registerPaymentMethod(tranferencia);

        if (procesador.processPayment("PAYPAL", 100, "1000")) {
            System.out.println("Pago exitoso");
        } else {
            System.out.println("Error en el pago");
        }



    }

    private static void demonstrateLSPViolation() {
        System.out.println("--- LSP Violation ---");

        Product libro = new PhysicalProduct("Libro de POO", 50.0, 1.2);
        Product ebook = new DigitalProduct("Ebook de POO", 20.0, 1000);
        Product consultoria = new ServiceProduct("Consultoría técnica", 150.0, 120);

        Product[] productos = { libro, ebook, consultoria };

        for (Product producto : productos) {
            System.out.println("\nProcesando: " + producto.getName());
            try {
                producto.processOrder();
            } catch (UnsupportedOperationException e) {
                System.out.println("ERROR - Violación LSP detectada: " + e.getMessage());
            }
        }

    }

    private static void demonstrateISPViolation() {
        System.out.println("--- ISP Violation ---");

        // BasicOrderProcessor SOLO depende de OrderManager (3 métodos)
        OrderManager basico = new BasicOrderProcessor();
        basico.createOrder(1, List.of(100, 200));
        basico.updateOrderStatus(1, "CREADO");
        basico.cancelOrder(1);

        System.out.println();

        // ShippingOrderProcessor depende de OrderManager + ShippingService
        ShippingOrderProcessor conEnvio = new ShippingOrderProcessor();
        conEnvio.createOrder(2, List.of(300));
        conEnvio.calculateShippingCost(2);
        conEnvio.scheduleDelivery(2, new Date());
        conEnvio.trackShipment(2);

        // También funciona por la interfaz pequeña que le interesa al cliente
        ShippingService soloEnvios = conEnvio;
        soloEnvios.trackShipment(2);

        System.out.println();

        // CompleteOrderProcessor combina todas las capacidades
        CompleteOrderProcessor completo = new CompleteOrderProcessor();
        completo.createOrder(3, List.of(400));
        completo.processPayment(3, "VISA", "tok_123");
        completo.sendOrderConfirmation(3);
        System.out.println(completo.generateOrderReport(3));
    }

    private static void demonstrateDIPViolation() {
        System.out.println("--- DIP Violation ---");

        // Producción: dependencias reales inyectadas por constructor
        NotificationService emailService = new EmailNotificationService();
        Logger fileLogger = new FileLoggerService();
        OrderRepository dbRepository = new DatabaseOrderRepository();
        OrderService produccion = new OrderService(emailService, fileLogger, dbRepository);
        produccion.processOrder("CUST-001", new String[]{"PROD-1", "PROD-2"}, "EMAIL");
        produccion.cancelOrder("ORDER-PROD-001");

        System.out.println();

    }
}