package ejercicio_03.solucion;

public class GameSession {

    private GameConfig config;

    public GameSession() {
        this.config = GameConfig.getInstance(); //  Instancia del Singleton
        config.setMaxPlayers(50); // Configuración específica
    }

    public void startSession() {
        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
