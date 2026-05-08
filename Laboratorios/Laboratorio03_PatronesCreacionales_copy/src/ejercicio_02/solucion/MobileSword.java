/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

public class MobileSword extends Weapon {

    public MobileSword() {
        this.name = "Espada";
        this.platform = "Mobile";
        this.damage = 30;
    }

    @Override
    public void use() {
        System.out.println("Espada Mobile con gráficos simples");
        
    }
}
