public class Main {
    public static void main(String[] args) {
        Beverage cafe = new Espresso("Cafe Simple");
        Beverage cafeConLeche = new Milk("Cafe con Leche", cafe);
        Beverage cafeConLecheChocolatada = new Chocolate("Cafe con Leche Chocolatada", cafeConLeche);

        System.out.println(cafeConLecheChocolatada.cost());
        System.out.println(cafeConLecheChocolatada.getDescription());
    }
}
