package ejercicio_01.solucion;

public class FPSFactory extends GameFactory{

    @Override
    public Game createGame() {
        return new FPSGame();
    }

    @Override
    public void playGame() {
        System.out.println("JUGANDO VALORANT (FPS)");
        
    }
    
}
