package ejercicio_02.solucion;

public abstract class GameElementFactory {
    public abstract Character createWarrior();
    public abstract Character createEnemy();
    public abstract Weapon createSword();
    public abstract Weapon createClaw();

}
