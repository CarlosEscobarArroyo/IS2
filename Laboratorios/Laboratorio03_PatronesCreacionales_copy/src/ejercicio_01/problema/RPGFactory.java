package ejercicio_01.problema;

public class RPGFactory implements GameFactory{

    public RPGFactory() {
    }

    @Override
    public Game createGame() {
        return new RPGGame();
    }
    
}
