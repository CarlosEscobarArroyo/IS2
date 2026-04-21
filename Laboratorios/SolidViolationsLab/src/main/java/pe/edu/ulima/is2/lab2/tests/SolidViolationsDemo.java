package pe.edu.ulima.is2.lab2.tests;

import pe.edu.ulima.is2.lab2.corrected.LSP.DigitalProduct;
import pe.edu.ulima.is2.lab2.corrected.LSP.PhysicalProduct;
import pe.edu.ulima.is2.lab2.corrected.LSP.Product;
import pe.edu.ulima.is2.lab2.corrected.LSP.ServiceProduct;
import pe.edu.ulima.is2.lab2.corrected.paymentprocessor.ApplePayPayment;
import pe.edu.ulima.is2.lab2.corrected.paymentprocessor.BankTransferPayment;
import pe.edu.ulima.is2.lab2.corrected.paymentprocessor.CreditCardPayment;
import pe.edu.ulima.is2.lab2.corrected.paymentprocessor.PayPalPayment;
import pe.edu.ulima.is2.lab2.corrected.paymentprocessor.PaymentMethod;
import pe.edu.ulima.is2.lab2.corrected.paymentprocessor.PaymentProcessor;
import pe.edu.ulima.is2.lab2.corrected.user.DiscountCalculator;
import pe.edu.ulima.is2.lab2.corrected.user.User;
import pe.edu.ulima.is2.lab2.corrected.user.UserReportGenerator;

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
        // TODO: Implementar demostración
    }

    private static void demonstrateDIPViolation() {
        System.out.println("--- DIP Violation ---");
        // TODO: Implementar demostración
    }
}