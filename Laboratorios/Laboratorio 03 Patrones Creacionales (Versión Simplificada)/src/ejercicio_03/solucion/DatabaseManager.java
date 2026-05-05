package ejercicio_03.solucion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class DatabaseManager {

    private GameConfig config;

    public DatabaseManager() {
        this.config = GameConfig.getInstance(); //  Misma instancia Singleton
        config.setDatabaseUrl("jdbc:mysql://production:3306/gamedb");
    }

    public void saveData() {
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
