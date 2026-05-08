package Facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> itemsAComprar = new ArrayList<>();
        itemsAComprar.add(new Item("Switch 2", 20, 400));
        itemsAComprar.add(new Item("Switch 2", 20, 400));
        itemsAComprar.add(new Item("Switch 2", 20, 400));
        itemsAComprar.add(new Item("Switch 2", 20, 400));

        comprar(itemsAComprar);
        
    }

    public static void comprar(List<Item> items) {
        FacadeVentasManager manager = new FacadeVentasManager();
        if (!manager.validarStock(items)) {
            System.out.println("No existen los items");
        } else {
            System.out.println("Si existen los items");
        }

        float shipping = manager.calcularShipping(items);
        System.out.println(shipping);
        float descuento = manager.calcularDescuento(items);
        System.out.println(descuento);

    }
}
