package pe.edu.ulima.is2.lab2.corrected.DIP;

import java.util.ArrayList;
import java.util.List;

public class MockLogger implements Logger {

    private final List<String> logs = new ArrayList<>();

    @Override
    public void log(String message) {
        logs.add(message);
        System.out.println("[MOCK LOG] " + message);
    }

    public List<String> getLogs() {
        return logs;
    }
}
