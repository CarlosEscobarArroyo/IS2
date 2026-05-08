package ejercicio_02.solucion;

public class PCClaw extends Weapon {

    public PCClaw() {
        this.name = "Garra";
        this.platform = "PC";
        this.damage = 25;
    }

    @Override
    public void use() {
        System.out.println("Garra PC con rasguños realistas");
    }
}
