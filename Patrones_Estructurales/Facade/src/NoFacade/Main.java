package NoFacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.addItem(new Item("PS5", 12, 500));
        inventario.addItem(new Item("Switch 2", 20, 400));

        List<Item> itemsAComprar = new ArrayList();

        comprar(itemsAComprar, inventario);
        
    }

    public static void comprar(List<Item> items, Inventario inventario) {
        for (Item i : items) {
            if (!inventario.existeItem(i)) {
                return;
            }
        }

        Descuento descuento = new Descuento();
        float desc = descuento.aplicarDescuento(items);
        
        Shipping shipping = new Shipping();
        float shipp = shipping.calcularShipping(items);


    }
}
