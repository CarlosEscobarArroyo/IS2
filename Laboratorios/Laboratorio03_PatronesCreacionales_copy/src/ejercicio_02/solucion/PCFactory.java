package ejercicio_02.solucion;

public class PCFactory extends GameElementFactory {

    @Override
    public Character createWarrior() {
        return new PCWarrior();
    }

    @Override
    public Character createEnemy() {
        return new PCEnemy();
    }

    @Override
    public Weapon createSword() {
        return new PCSword();
    }

    @Override
    public Weapon createClaw() {
        return new PCClaw();
    }
}
