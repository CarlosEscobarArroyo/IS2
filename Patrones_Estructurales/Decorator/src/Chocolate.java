public class Chocolate extends BeverageDecorator{

    public Chocolate(String description, Beverage decorado) {
        super(description, decorado);
    }

    @Override
    public float cost() {
        return decorado.cost()+4f;
    }
    

}
