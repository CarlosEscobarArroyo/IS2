package ejercicio_01.solucion;

public class RPGFactory extends GameFactory{

    @Override
    public Game createGame() {
        return new RPGGame();
    }

    @Override
    public void playGame() {
        System.out.println("JUGANDO WOW (RPG)");
        
    }
    
}
