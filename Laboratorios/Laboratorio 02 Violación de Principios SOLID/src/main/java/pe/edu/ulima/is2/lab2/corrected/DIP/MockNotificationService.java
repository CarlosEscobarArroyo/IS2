package pe.edu.ulima.is2.lab2.corrected.DIP;

import java.util.ArrayList;
import java.util.List;

public class MockNotificationService implements NotificationService {

    private final List<String> notificationsSent = new ArrayList<>();

    @Override
    public void sendNotification(String type, String recipient, String message) {
        String record = "[MOCK] " + type + " -> " + recipient + " : " + message;
        notificationsSent.add(record);
        System.out.println(record);
    }

    public List<String> getNotificationsSent() {
        return notificationsSent;
    }
}
