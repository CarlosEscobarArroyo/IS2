package ejercicio_02.solucion;

public class PCSword extends Weapon {

    public PCSword() {
        this.name = "Espada";
        this.platform = "PC";
        this.damage = 30;
    }

    @Override
    public void use() {
        System.out.println("Espada PC con gráficos detallados");
    }
}
