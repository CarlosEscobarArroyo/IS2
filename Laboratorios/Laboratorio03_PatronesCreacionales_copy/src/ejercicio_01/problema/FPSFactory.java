package ejercicio_01.problema;

public class FPSFactory implements GameFactory{

    public FPSFactory() {
    }

    @Override
    public Game createGame() {
        return new FPSGame();
    }
    
}
