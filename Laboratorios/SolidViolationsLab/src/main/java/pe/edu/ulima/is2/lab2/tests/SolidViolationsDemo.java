package pe.edu.ulima.is2.lab2.tests;

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
    }

    private static void demonstrateLSPViolation() {
        System.out.println("--- LSP Violation ---");
        // TODO: Implementar demostración
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