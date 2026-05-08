package repaso.ejercicio_02;

public class PCFactory extends GameElementFactory{

    @Override
    public Weapon createClaw() {
        return new PCClaw();
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
    public Character createWarrior() {
        return new PCWarrior();
    }
    
}
