/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.ejercicio_03;


public class GameSession {

    private GameConfig config;

    public GameSession() {
        this.config = GameConfig.getInstance(); //  Nueva instancia
        config.setMaxPlayers(50); // Configuración específica
    }

    public void startSession() {
        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
