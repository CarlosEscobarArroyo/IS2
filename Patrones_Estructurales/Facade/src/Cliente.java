public class Cliente {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.addItem(new Item("PS5", 12, 500));
        inventario.addItem(new Item("Switch 2", 20, 400));

    }
}
