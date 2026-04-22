package pe.edu.ulima.is2.lab2.corrected.DIP;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String type, String recipient, String message) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            System.out.println("Enviando EMAIL a " + recipient + ": " + message);
        } else if ("SMS".equalsIgnoreCase(type)) {
            System.out.println("Enviando SMS a " + recipient + ": " + message);
        } else {
            System.out.println("Enviando notificación (" + type + ") a " + recipient + ": " + message);
        }
    }
}
