public class Cliente {
    public static void main(String[] args) {
        Beverage cafe = new Espresso("Cafe Simple");
        Beverage cafeConLeche = new Milk("Cafe con Leche", cafe);
        Beverage cafeConLecheChocolatada = new Chocolate("Cafe con Lechechocolatada", cafeConLeche);

        System.out.println(cafeConLecheChocolatada.cost());
    }
}
