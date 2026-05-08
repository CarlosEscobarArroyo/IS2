package repaso.ejercicio_01;

public class RPGGameFactory implements GameFactory{

    @Override
    public Game createGame() {
        return new RPGGame();
    }

    @Override
    public void playGame() {
        System.out.println("Jugando un RPG!!i");        
    }
    
}
