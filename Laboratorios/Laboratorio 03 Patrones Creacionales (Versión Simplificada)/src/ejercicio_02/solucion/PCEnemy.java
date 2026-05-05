package ejercicio_02.solucion;

public class PCEnemy extends Character {

    public PCEnemy() {
        this.name = "Enemigo";
        this.platform = "PC";
        this.health = 150;
    }

    @Override
    public void attack(Character target) {
        int damage = (this.weapon != null) ? this.weapon.getDamage() : 5;
        System.out.println("Enemigo PC ataca con furia en alta resolución a " + target.name);
        if (this.weapon != null) {
            this.weapon.use();
        }
        target.takeDamage(damage);
    }
}
