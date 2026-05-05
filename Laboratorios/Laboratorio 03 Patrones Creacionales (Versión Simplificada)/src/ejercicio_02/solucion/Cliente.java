package ejercicio_02.solucion;

public class Cliente {

    public static void main(String[] args) {
        
        System.out.println("\n--- Testeando PC ---\n");
        GameElementFactory factory = new PCFactory();
        simularEjecucion(factory);


        System.out.println("\n--- Cambiando a Mobile ---\n");
        factory = new MobileFactory();
        simularEjecucion(factory);

    }

    public static void simularEjecucion(GameElementFactory factory) {
        Character warrior = factory.createWarrior();
        Character enemy = factory.createEnemy();
        Weapon sword = factory.createSword();
        Weapon claw = factory.createClaw();

        warrior.equipWeapon(sword);
        enemy.equipWeapon(claw);

        System.out.println(warrior.getInfo());
        System.out.println(enemy.getInfo());

        warrior.attack(enemy);
        enemy.attack(warrior);
    }
}
