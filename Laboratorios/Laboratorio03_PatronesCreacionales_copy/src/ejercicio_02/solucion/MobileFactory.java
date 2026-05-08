package ejercicio_02.solucion;

public class MobileFactory extends GameElementFactory{

    @Override
    public Weapon createClaw() {
        return new MobileClaw();
    }

    @Override
    public Character createEnemy() {
        return new MobileEnemy();
    }

    @Override
    public Weapon createSword() {
        return new MobileSword();
    }

    @Override
    public Character createWarrior() {
        return new MobileWarrior();
    }
    

}
