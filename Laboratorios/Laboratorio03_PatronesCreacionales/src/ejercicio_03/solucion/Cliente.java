package ejercicio_03.solucion;

public class Cliente {

    public static void main(String[] args) {
        GameSession session = new GameSession();
        NetworkManager network = new NetworkManager();
        DatabaseManager database = new DatabaseManager();

        session.startSession();
        network.connect();
        database.saveData();
    }

}
