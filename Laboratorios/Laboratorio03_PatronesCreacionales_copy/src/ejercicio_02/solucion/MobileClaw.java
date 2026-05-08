package ejercicio_02.solucion;

public class MobileClaw extends Weapon {

    public MobileClaw() {
        this.name = "Garra";
        this.platform = "Mobile";
        this.damage = 25;
    }

    @Override
    public void use() {
        System.out.println("Garra Mobile con rasguños simples");

    }
}
