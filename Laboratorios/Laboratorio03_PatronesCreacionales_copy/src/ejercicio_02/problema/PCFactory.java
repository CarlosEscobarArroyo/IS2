package ejercicio_02.problema;

public class PCFactory extends GameElementFactory {
    @Override
    public Character createEnemy() {
        return new PCEnemy();
    }

    @Override
    public Character createWarrior() {
        return new PCWarrior();
    }
    
}
