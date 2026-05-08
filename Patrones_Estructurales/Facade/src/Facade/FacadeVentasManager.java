package Facade;
import java.util.List;


public class FacadeVentasManager {
    private Inventario inventario;
    private Descuento descuento;
    private Shipping shipping;


    public FacadeVentasManager() {
        descuento = new Descuento();
        shipping = new Shipping();
        inventario = new Inventario();

        inventario.addItem(new Item("Switch 2", 20, 400));
        inventario.addItem(new Item("Switch 2", 20, 400));
        inventario.addItem(new Item("Switch 2", 20, 400));
    }
    
    public float calcularShipping(List<Item> items) {
        return shipping.calcularShipping(items);
    }

    public boolean validarStock(List<Item> items) {
        for (Item i : items) {
            inventario.existeItem(i);
            return true;
        }
        return false;
    }

    public float calcularDescuento(List<Item> items) {
        return descuento.aplicarDescuento(items);
    }


}
