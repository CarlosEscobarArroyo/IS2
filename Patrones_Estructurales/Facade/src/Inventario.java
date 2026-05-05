import java.util.ArrayList;
import java.util.List;


public class Inventario {
    List<Item> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public boolean existeItem(Item item) {
        for (Item i: items) {
            if (i.getNombre().equals(item.getNombre()) && i.getCantidad() >= item.getCantidad()) {
                return true;
            }
        }
        return false;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}

